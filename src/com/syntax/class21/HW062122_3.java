package com.syntax.class21;

public class HW062122_3 {

    static void goToBeach(String season){
        System.out.println("In summer time  we everyday go to outside");
    }
   static void goToBeach(String season, int tem){
      System.out.println("When temperature is more than 70 we go to beach");
  }
   static void goToBeach(String season, int tem, int water){
       System.out.println("When temperature of water more than 68 we can swim");
}

    public static void main(String[] args) {
        goToBeach("Summer");
        goToBeach("Summer",70);
        goToBeach("Summenr",70,68);
    }
}


