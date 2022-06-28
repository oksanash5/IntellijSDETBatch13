package com.syntax.class19;

public class Task5 {
    //Write a java Class Students that have a constructor
    //which takes students name and 3 subject grades.
    //Inside your class also have a method to Calculate Average Grade.
    //Test Student class for 5 different students with different marks.
    //Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables. */
    public static void main(String[] args) {
        Student student=new Student("Best Student Ozkhan",99.9,85.6,97.5);
        student.calcucalateAvgGrade();

        Student student1=new Student("Sammer",70.9,85.6,97.5);
        student1.calcucalateAvgGrade();
    }
}
