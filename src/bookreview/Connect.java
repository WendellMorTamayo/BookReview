/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookreview;

import bookreview.admin.BookForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Connect {
    Connection conn = null;
    
    public Connect(){
        String url = "jdbc:mysql://localhost:3306/dbbookreview";       
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Connection getConnection(){
        return conn;
    }
     
    public boolean registerUser(User user) {
        String sql = "INSERT INTO tbluser(firstname, lastname, username, password) VALUES (?,?,?,?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUsername());
            statement.setString(4, user.getPassword());
            int row = statement.executeUpdate();
            return row > 0;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "User '" + user.getUsername() + "' already exists! Please try again.");
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean verifyUser(String username) {
        String sql = "UPDATE tbluser SET Status = 1 WHERE username = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, username);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed verification");
            System.out.println(e.getMessage());
            return false;
        }
    }

    
    public int login(String username, String password) {
        String sql = "SELECT * FROM tbluser WHERE username=? AND password=?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return result.getInt("userType");
            } else {
                JOptionPane.showMessageDialog(null, "User does not exist! Please try again." );
                return -1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while trying to log in: " + e.getMessage());
            return -1;
        }
    }

       
       
    public ArrayList<Review> displayReviews(String username) {
        ArrayList<Review> rev = new ArrayList<Review>();
        String sql = "select * from tblreview_confirmation where username='" + username + "'";
        Statement stmt;
        ResultSet rs;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Review a = new Review(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                rev.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rev;
    }
    
    public ArrayList<Book> displayBooks() {
        ArrayList<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                List<String> bookAuthors = new ArrayList<>();
                bookAuthors.add(rs.getString("authors_firstname" + " " + rs.getString("authors_lastname")));
                Book book = new Book(rs.getString("title"), bookAuthors, rs.getString("isbn"));
                books.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return books;
    }
    
    public boolean addBook(String title, String isbn, String categoryname, String firstname, String lastname) {
        try (PreparedStatement selectStmt = conn.prepareStatement("SELECT Category_Key FROM tblcategory WHERE Category_Name = ?");
             PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO tblbook (title, category_key, isbn, authors_firstname, authors_lastname) VALUES (?, ?, ?, ?, ?)")) {
            // Check if book already exists
            selectStmt.setString(1, categoryname);
            try (ResultSet rs = selectStmt.executeQuery()) {
                if (!rs.next()) {
                    // Category not found
                    return false;
                }
                int categoryKey = rs.getInt("Category_Key");
                // Insert new book
                insertStmt.setString(1, title);
                insertStmt.setInt(2, categoryKey);
                insertStmt.setString(3, isbn);
                insertStmt.setString(4, firstname);
                insertStmt.setString(5, lastname);
                int rowsInserted = insertStmt.executeUpdate();
                return rowsInserted > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean updateBook(String title, String isbn, String categoryname, String firstname, String lastname, boolean updateTitle) {
        try (PreparedStatement selectStmt = conn.prepareStatement("SELECT Category_Key FROM tblcategory WHERE Category_Name = ?");
             PreparedStatement updateStmt = conn.prepareStatement("UPDATE tblbook SET category_key = ?, isbn = ?, authors_firstname = ?, authors_lastname = ?" + (updateTitle ? ", title = ?" : "") + " WHERE isbn = ?")) {
            selectStmt.setString(1, categoryname);
            try (ResultSet rs = selectStmt.executeQuery()) {
                if (!rs.next()) {
                    return false;
                }
                int categoryKey = rs.getInt("Category_Key");
                updateStmt.setInt(1, categoryKey);
                updateStmt.setString(2, isbn);
                updateStmt.setString(3, firstname);
                updateStmt.setString(4, lastname);
                if (updateTitle) {
                    updateStmt.setString(5, title);
                    updateStmt.setString(6, isbn);
                } else {
                    updateStmt.setString(5, isbn);
                }
                int rowsUpdated = updateStmt.executeUpdate();
                return rowsUpdated > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String getCategoryName(int categoryKey) {
        String categoryName = null;
        try (PreparedStatement stmt = conn.prepareStatement("SELECT Category_Name FROM tblcategory WHERE Category_Key = ?")) {
            stmt.setInt(1, categoryKey);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    categoryName = rs.getString("Category_Name");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categoryName;
    }

    public boolean deleteBook(String isbn) {
        try {
            if (!bookExists(isbn)) {
                return false;
            }

            String query = "DELETE FROM tblbook WHERE ISBN=?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, isbn);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted == 0) {
                return false;
            }

            return true;
        } catch (SQLException ex) {
            System.out.println("Error deleting book: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean deleteModerator(String username) {
        try {
            if (!moderatorExists(username)) {
                return false;
            } 
            String query = "DELETE FROM tbluser where username=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            
            int rowsDeleted = ps.executeUpdate();
            if(rowsDeleted == 0) {
                return false;
            }
            
            return true;
        } catch (SQLException ex) {
            System.out.println("Error deleting moderator: " + ex.getMessage());
            return false;
        }
    }

    public boolean bookExists(String isbn) {
        try {
            String sql = "SELECT COUNT(*) FROM tblbook WHERE isbn=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, isbn);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return (count > 0);
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error checking if book exists: " + e.getMessage());
            return false;
        }
    }
    
    public boolean moderatorExists(String username) {
        try {
            String sql = "SELECT COUNT(*) FROM tbluser where username=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error checking if moderator exists: " + e.getMessage());
            return false;
        }
    }

    public boolean registerModerator(User user, String email) {
        String sql = "INSERT INTO tbluser(firstname, lastname, username, password, userType, email) VALUES (?,?,?,?,1,?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUsername());
            statement.setString(4, user.getPassword());
            statement.setString(5, email);
            int row = statement.executeUpdate();
            return row > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "User '" + user.getUsername() + "' already exists! Please try again.");
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
