package com.syntax.class18;

public class Car {

   private String make;
    private String model;
   private String color;

    public Car(String carMake, String carModel, String carColor) {
        make = carMake;
        model = carModel;
        color = carColor;

    }
public Car (String carModel){
        model=carModel;
}
//public Car (String sdfs){// it is not allowed to have
      //model=carModel;    // two constructors in a class
                         //with same

 void printCarModel()  {
     System.out.println("Model"+ model);
 }
void printInfo() {
        System.out.println("Make "+make+" Model "+model+" color "+color);
    }
}