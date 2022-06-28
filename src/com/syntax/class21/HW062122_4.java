package com.syntax.class21;
//Create 1 class with a private method that has 3 overloaded forms.
// Then call each overloaded method
// with specific arguments
// and observe result.
public class HW062122_4 {
    private void goToBeach(String season) {
        System.out.println("In summer time  we everyday go to outside");
    }

    private void goToBeach(String season, int tem) {
        System.out.println("When temperature is more than 70 we go to beach");
    }

    private void goToBeach(String season, int tem, int water) {
        System.out.println("When temperature of water more than 68 we can swim");
    }

    public static void main(String[] args) {
        // We have to create an Object of class with private method.
        HW062122_4 summer=new HW062122_4();
        summer.goToBeach("Summer");
        summer.goToBeach("Summer", 70);
        summer.goToBeach("Summenr", 70, 68);
    }
}