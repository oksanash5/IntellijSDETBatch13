package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed, String Color, int age,double weight){
        //When we have same name variables as local and as instance a class
        //aoways local variable are prefferred over instance variable
        //by java in block of code
        this.breed=breed;// we can use this
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    String getCowInfo(){
        return "Breed"+breed+"Color"+color+"Age"+age+"Weight"+weight;
    }
}
