package com.darngea;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {    
    
    public static void main(String[] args) {
        ArrayList<Music> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input objects count: ");
        int count = input.nextInt();
        int total_sold = 0;
        int mp3_count = 0;
        boolean mp3 = true;
        for (int i = 0; i < count; i++) {
            Music mus = new Music("music" + i, 10*i, mp3);
            mp3 = !mp3;
            list.add(mus);
            total_sold += list.get(i).getSold();
            if (list.get(i).hasMP3download()) mp3_count++;            
        }
        System.out.println("Total music copies sold: " + total_sold);
        System.out.println("MP3 files counted: " + mp3_count);
    }   
}
