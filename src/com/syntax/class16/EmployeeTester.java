package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.name="Merve";
       // employee.salary=125000; // error we cant' access because prived
        //employee.department="IT"; // error because it's default we can
        // access to dif classes
        System.out.println(Employee.manager);
        Employee.printManager();// Static field and methods can also be accessed
        // by just writting name of class

    }
}
