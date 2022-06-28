package com.syntax.class24;

public class task1 {
   // Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
 //   Define common behavior within parent class and override some of the methods in child classes
           // Define some methods specific to child classes
          //  Write example of achieving run time polymorphism

}
class Student{

    void study(){
        System.out.println("Students must study");
    }
    void doHemork(){
        System.out.println("Students should do homework");
    }
void practice(){
    System.out.println("Students must practice");
}
}

class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("Syntax student must learn programming");
    }
    void doHomeWork(){
        System.out.println("Syntax students must solve the Pepls to get a good job");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must practice to get a good job");
    }
}

class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College students must practice to get good grades");
    }
}
class SchollStudent extends Student{

}