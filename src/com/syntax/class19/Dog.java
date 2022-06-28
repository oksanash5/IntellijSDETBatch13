package com.syntax.class19;
class Animal{
    String name;
    String beed;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println( "Name"+name+"Color"+color);

    }

}
public class Dog extends Animal{  // only one public class we can creat, rest without publick
    Dog(String name, String color){
        this.name=name;// using extends keyword we are able to access
                     // the name field from the animal class
        this.color=color;
    }
   void printInfo(){
       System.out.println( "Name"+name+"Color"+color);

   }
}
    class Cat extends Animal {
        Cat(String name, String color) {
            this.name = name;
            this.color = color;

        }
    }