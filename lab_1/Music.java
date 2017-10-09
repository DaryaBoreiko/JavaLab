package com.darngea;

public class Music {
    
    private String title;
    private int sold;
    private boolean mp3download;

    public Music(){}

    public Music(String title, int sold, boolean mp3download) {
        this.title = title;
        this.sold = sold;
        this.mp3download = mp3download;
    }
    
    public String getTitle() {
        return title;
    }

    public int getSold() {
        return sold;
    }
    
    public boolean hasMP3download() {
        return mp3download;
    }
}
