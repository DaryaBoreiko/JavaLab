package com.darngea;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {    
    
    public static void main(String[] args) {

        ArrayList<Worker> list = new ArrayList<Worker>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input objects count: ");
        int how_much = input.nextInt();
        //scan /n after number
        input.nextLine();
        
        for (int i = 0; i < how_much; i++) {
            System.out.print("Input " + (i+1) + " workers name: ");
            String name = input.nextLine();
            System.out.print("Input " + (i+1) + " workers post: ");
            String post = input.nextLine();
            System.out.print("Input " + (i+1) + " workers salary: ");
            int salary = input.nextInt();
            //scan /n after number
            input.nextLine();
            Worker temp = new Worker(name, post, salary);
            list.add(temp);
        }
        
        File file = new File("workers.bin");
        
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for (Worker wrk: list)
                System.out.println(wrk.toString());
            oo.writeObject(list);
            oo.flush();
            oo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Data has been recorded!");
        System.out.println("Reading...");
        
        try {
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println("New list created");
            ArrayList<Worker> list2 = (ArrayList<Worker>)oi.readObject();
            for (int i = 0; i < how_much; i++) {
                System.out.println(list2.get(i).toString());
            }
            oi.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }   
}
