package com.darngea;

public class Book {
    
    private String publisher;
    private String author;
    private int pages_count;

    public Book() {}

    public Book(String publisher, String author, int pages_count) {
        this.publisher = publisher;
        this.author = author;
        this.pages_count = pages_count;
    }
    
    public String showThis() {
        return "This is book!";
    }
    
    @Override
    public String toString() {
        return showThis() + "\nPublisher: " + publisher + "\nAuthor: " + author + "\nPages count: " + pages_count + "\n";
    }
    
    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pages_count;
    }

}
