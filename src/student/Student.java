package student;

import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> listRating;
    private double average;

    public Student(String name){
        this.name = name;
    }

    public double getAverage(){
        return average;
    }

    public String getNom(){
        return name;
    }
}
