package com.syntax.class22;

public class AdvString {
  static  void printNames(String ... names){
        for (String name:names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
      printNames("Aladin","Aladin","Aladin");
        int age =10;
        String name;
        if (age>18){
            name="Time to go work";
        }else{
            name="Enjoy no work";
        }
        System.out.println(name);

        String name2=age>18?"Time to go work":"Enjoy no work";
        System.out.println(name2);

        String name3=age>18? age>10? "nested in":"it is nested else":"Enjoy no Work";
        System.out.println(name3);
    }
}
