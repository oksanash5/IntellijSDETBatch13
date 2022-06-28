package com.syntax.class16;

public class Dog {
     String name;
     String color;
     static int noOfLegs=4;


     public static void main(String[]  args){
         Dog dog1=new Dog();
         dog1.name="Tommy";
         dog1.color="Pink";

         Dog dog2=new Dog();
         dog2.name="Fido";
         dog2.color="Black";

         Dog dog3=new Dog();
         dog3.name="Jajaja";
         dog3.color="White";

         System.out.println(dog1.name);//Jajaja  if  name is static variable
         System.out.println(dog2.name);//Jajaja   if name is static variable
         System.out.println(dog3.name);//Jajaja  if name is static variable

         System.out.println(dog3.color);
     }
}
