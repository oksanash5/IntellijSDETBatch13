package com.syntax.class20;
///Write program: Shape class has a constructor that takes the radius
// and has a subclass as  circle class.
// In circle class create a method to calculate the area of circle. Test your code

public class Shape {
    double radius;

    Shape(double radius) {
    this.radius=radius;
}
}
    class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
void calculotorOfArea(){
    System.out.println("Area of circle is "+radius*radius*Math.PI);
}

        public static void main(String[] args) {
            Circle circle=new Circle(5);
            circle.calculotorOfArea();
        }
}

