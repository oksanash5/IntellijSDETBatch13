package com.syntax.class19;

public class Student {

    double g1Marks;
    double g2Marks;
    double g3Marks;
    String name;

    Student(String name,double grade1Marks,double grade2Marks,double grade3Marks){
        g1Marks=grade1Marks;
        g2Marks=grade2Marks;
        g3Marks=grade3Marks;
        this.name=name;//we are using this name because we have same name
                        //variables inside the constructor as well

    }
      public void calcucalateAvgGrade(){
        double avgGrade=(g1Marks+g2Marks+g2Marks)/3;
       System.out.println(name+" "+avgGrade);
}
}
