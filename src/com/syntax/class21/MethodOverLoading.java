package com.syntax.class21;

public class MethodOverLoading {

   static void add (int number1, int number2){

      System.out.println(number1+number2);
   }
  static void addDoubles(double number1, double number2){
   System.out.println(number1+number2);
}

   static void add3Doubles(double number1, double number2,double number3) {
      System.out.println(number1 + number2 +number3);

   }
   public static void main(String[] args) {
      add(20,20);
      addDoubles(20.5, 20.6);
   }
}

