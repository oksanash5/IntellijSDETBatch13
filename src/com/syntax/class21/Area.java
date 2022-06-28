package com.syntax.class21;

public class Area {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //1. Rectangle
    //2. Square
    //3. Box

    void calculatorOfArea(int length, int width){
        System.out.println("Area of rectangle is "+ length*width);
    }
   void calculatorOfArea (int length){
    System.out.println("Area of square is "+ length*2);
}
   void volume(int length, int width, int height){
    System.out.println("Volume of box is "+ length*width*height);
}


    public static void main(String[] args) {
        Area a=new Area();
        a.calculatorOfArea(10,20);
        a.calculatorOfArea(10);
        a.volume(10,20,5);

    }
}