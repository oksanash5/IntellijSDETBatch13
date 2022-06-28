package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        // better way
        Car car=new Tesla();
        car=new Toyota();// reassign the value
        car.start();
        car.stop();
        car.park();
        //Tesla tesla=new Car();  not available

        // instead of
        BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.start();

        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.start();

        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();
        System.out.println("________________");

        Car[] cars={new BMW(), new Tesla(),new Toyota()};

        for (Car c:cars){
            c.start();
            c.stop();
            c.park();
        }

    }

}
