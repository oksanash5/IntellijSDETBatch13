package com.syntax.class16;

public class Student {
    String name;// instance  variable
    int ID; // instane variable
    static int numberOfStudent=0;


    public static void main(String[] args) {
        Student student1=new Student();
        student1. name="Oksana";
        student1.ID=111234;
        numberOfStudent++; // if we are inside the same class we can access static variable inside
        // static method by just writing the name of that variable we don't need to create an object

        Student student2=new Student();
        student2. name="Nataly";
        student2.ID=111235;
        numberOfStudent++;

        Student student3=new Student();
        student3. name="Sergei";
        student3.ID=111236;
        numberOfStudent++;

        System.out.println("Total number of students is " + numberOfStudent);
    }

}
