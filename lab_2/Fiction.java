package com.darngea;


public class Fiction extends Book {
    
    private String genre;

    public Fiction() {
    }

    public Fiction(String publisher, String author, int pages_count) {
        super(publisher, author, pages_count);
    }
    
    public Fiction(String genre, String publisher, String author, int pages_count) {
        super(publisher, author, pages_count);
        this.genre = genre;
    }
    
    @Override
    public String showThis() {
        return "This is fiction!";
    }

    @Override
    public String toString() {
        return super.toString() + "Genre: " + genre + "\n";
    }
}
