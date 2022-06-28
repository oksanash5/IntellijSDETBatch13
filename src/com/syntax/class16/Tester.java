package com.syntax.class16;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
       // System.out.println(ac.passsword);  not access, private

        String str=new String();// we don't see any import because thi c;ass
        // is present inside the java.lang
        // all ten classes inside java.lang package are imported dy default for
        System.out.println(ac.name);
        System.out.println(ac.ssn);
      //  Employee emp=new Employee

        Scanner scan=new Scanner(System.in);
    }
}
