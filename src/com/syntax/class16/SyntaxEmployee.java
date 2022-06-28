package com.syntax.class16;

public class SyntaxEmployee {
    String empID;// instance
    int salary;

    // whenever we are sure that two object of a class can have different
    //values for a variable or if we have to share that variable between
   // two or more method of that  calss we should always go with instance variable
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        SyntaxEmployee emp2=new SyntaxEmployee();
        emp1.empID="OKSANA123";
        emp1.salary=100000;

        emp2. empID="SERGEI789";
        emp2.salary=115000;

        System.out.println("Employee ID is " +emp1.empID+ " salary " +emp1.salary+ " CEO "+CEO);
        System.out.println("Employee ID is " +emp2.empID+ " salary " +emp2.salary+ " CEO "+CEO);

    }
}
