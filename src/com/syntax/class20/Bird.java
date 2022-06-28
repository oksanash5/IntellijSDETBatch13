package com.syntax.class20;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    void printInfo() {
        System.out.println("Name " + name + " color " + color);
    }

    Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }
}
class Parrot extends Bird {
    Parrot(String name, String color, int age, double weight) {
        super(name,color,age);//calling the parent class constructor
                                     // by writing the super()
       /// this.name = name;
       // this.color = color;
       // this.age = age;
       // this.weight = weight;


    }
}


class Sparrow extends Bird{
    Sparrow(String name, String color,int age, double weight){
        super(name,color,age, weight);
      //  this.name=name;
      //  this.color=color;
      //  this.age=age;
      //  this.weight=weight;
}

}
