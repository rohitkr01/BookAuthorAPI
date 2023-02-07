package com.example.BookAuthorAPI;

public class Book {
    private String bookName;
    private int pages;
    private String authorName;
    private int rating;

    public Book() {
        this.bookName = bookName;
        this.pages = pages;
        this.authorName = authorName;
        this.rating = rating;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
