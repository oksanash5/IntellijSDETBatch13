package com.syntax.class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBreed, String dogColor,int dogAge, double dogWeight){
        name = dogName;
        breed=dogBreed;
        color=dogColor;
        if (dogAge>0 && dogAge<25 ) {
            age = dogAge;
        }else{
            System.out.println("dog age can be greater than 30");
        }
        weight=dogWeight;
    }

    void printinfo(){
        System.out.println("Name" + name+"Breed"+breed+"color"+color+"weight"+ weight);
    }

    public static void main(String[] args) {
     /* Dog dog1=new Dog();
        dog1.name="lofy";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=15;
        dog1.weight=20;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Gofy";
        dog2.breed="American";
        dog2.color="White";
        dog2.age=15;
        dog2.weight=20;
        dog1.printInfo();*/
}


}