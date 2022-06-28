package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();

    }

}
class Wood {
    String color="Blue";
}
class Furniture extends Wood{
    String color="Black";

}
class Chair extends Furniture{
    String color="grey";// instance
    void printColor(){
        String color="White";// always local variable are preferred
        System.out.println(color);//White
        System.out.println(this.color); //grey  because this in instance veriable for class Chair
        System.out.println(super.color); // black

        // but "Blue" color from Wood we can not to accept.
        // only one super
    }
}