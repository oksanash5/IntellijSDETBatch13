package com.syntax.class17;

import com.syntax.class16.Dog;

public class Tester {
    public static void main(String[] args) {

        /*
        If classes exit inside the same pakage
         they are imported automatically
         */


        Employee employee =new Employee();
        Dog dog=new Dog();// was imported from class 16
        employee.name="Mike";
       // employee.salary=125000;  //error because salary is private in class Employee
       employee.department="IT Saver";
      // employee.printSalary(); // error from private method on class Employee
       employee.printDepartment();

    }
}
