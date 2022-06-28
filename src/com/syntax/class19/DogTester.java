package com.syntax.class19;

public class DogTester {
    public static void main(String[] args) {
        Cat cat=new Cat("kitty", "green");
       cat.printInfo(); // cat class does not have
        // this method but because we are using
        //inheritance we can use the method from
        //the paren class

        Dog dog =new Dog("Max","Blue");
        dog.printInfo();
    }
}
