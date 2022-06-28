package com.syntax.class24;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(), new CollegeStudent(), new SchollStudent()};
 // inheritance loop
        for (Student std:students){
            std.study();
            std.practice();
            std.doHemork();
        }
        System.out.println("-----------------");
       // simple loop
     for (int i=0; i< students.length; i++){
         students[i].study();
         students[i].doHemork();
         students[i].practice();
     }
    }
}
