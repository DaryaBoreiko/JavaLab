package com.darngea.university;

import java.io.Serializable;

public class Worker implements Serializable{
    
    private String name;
    private String post;
    private int salary;
    private static float multiplier = 1.1f;

    public Worker(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    
    public int getIncrease(){
        return salary - (int)(salary/multiplier);
    }

    @Override
    public String toString() {
        return "Hi, my name is " + name + ". I'm " + post + ". My fantastic salary is " + salary + "$ with " + getIncrease() + " basic increase.";
    }
}
