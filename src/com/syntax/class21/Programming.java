package com.syntax.class21;

public class Programming {
    void printMessage(){
        System.out.println("I love programming languages");
    }
   void printMessage(String str){
       System.out.println("I love Java");
   }

    public static void main(String[] args) {
        Programming programm=new Programming();
        programm.printMessage();
        programm.printMessage("Java");
    }
}
