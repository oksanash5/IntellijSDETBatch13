package com.syntax.class23;

public  class Animal { // if final no other class can inherit from animal
                            // it is declare final

    Animal(){
        System.out.println("parent");
    }
    void eat(){// if final method we a not able to change it
        System.out.println("all the anumal eat");
    }

}
class Panda extends Animal{

    final double G=9.8;// no one can change it

    void eat(){
        System.out.println("All the animal eat");
    }
  Panda(){
      System.out.println("Child");
  }
}
class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}