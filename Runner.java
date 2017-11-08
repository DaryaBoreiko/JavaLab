package com.darngea.university;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {    
    
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<Worker>();
        try {
            init(list);
        } catch(SalaryInputException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
        File file = new File("src" + File.separator + "workers.bin");
        
        try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Worker wrk: list)
                System.out.println(wrk);
            oo.writeObject(list);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Data has been recorded!");
        System.out.println("Reading...");
        
        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println("New list created");
            ArrayList<Worker> list2 = (ArrayList<Worker>)oi.readObject();
            for (Worker wrk: list2) {
                System.out.println(wrk);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void init(ArrayList<Worker> list) throws SalaryInputException {
        Scanner input = new Scanner(System.in);
        System.out.print("Input objects count: ");
        int count = input.nextInt();
        //scan /n after number input
        input.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Input " + (i+1) + " workers name: ");
            String name = input.nextLine();
            System.out.print("Input " + (i+1) + " workers post: ");
            String post = input.nextLine();
            System.out.print("Input " + (i+1) + " workers salary: ");
            int salary = input.nextInt();
            //scan /n after number input
            input.nextLine();
            if (salary <=0) throw new SalaryInputException("Error: negative/zero salary!");
            Worker temp = new Worker(name, post, salary);
            list.add(temp);
        }        
    }
}
