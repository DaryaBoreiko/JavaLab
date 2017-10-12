package com.darngea;

public class Scientific extends Book {
    
    private String theme;
    private boolean understandable;

    public Scientific() {
    }

    public Scientific(String publisher, String author, int pages_count) {
        super(publisher, author, pages_count);
    }

    public Scientific(String theme, boolean understandable, String publisher, String author, int pages_count) {
        super(publisher, author, pages_count);
        this.theme = theme;
        this.understandable = understandable;
    }
    
    @Override
    public String showThis() {
        return "This is scientific literature!";
    }

    @Override
    public String toString() {
        return super.toString() + "Theme: " + theme + "\nUnderstandable: " + understandable + "\n";
    }
}
