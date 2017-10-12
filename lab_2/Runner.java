package com.darngea;

import java.util.ArrayList;

public class Runner {    
    
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        for (int i = 1; i < 10; i++) {
            if (i >= 4) {
                if (i >= 7) {
                    Scientific temScientific = new Scientific("Theme_"+i, false, "Publ_"+i, "Auth_"+i, 12*i);
                    books.add(temScientific);
                } else {
                    Fiction tempFiction = new Fiction("Genr_"+i, "Publ_"+i,"Auth_"+i,11*i);
                    books.add(tempFiction);                    
                }
            } else {
                Book tempBook = new Book("Publ_"+i,"Auth_"+i,10*i);
                books.add(tempBook);                        
            }
        }

        for (Book itr: books) {
            itr.showThis();
            System.out.println(itr.toString());            
        }
    }   
}