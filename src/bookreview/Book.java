/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookreview;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Book {
    private String bookTitle;
    private String bookISBN;
    private List<String> bookAuthor;
    private String category;

    public Book(String bookTitle,List<String> bookAuthor, String bookISBN ) {
        this.bookTitle = bookTitle;
        this.bookISBN = bookISBN;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookName) {
        this.bookTitle = bookName;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public List<String> getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(List<String> bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    
    public String getCategory() {
        return bookISBN;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
