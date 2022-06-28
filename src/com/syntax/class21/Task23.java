package com.syntax.class21;

public class Task23 {
  static class Programming{
   Programming(){
            System.out.println("I love programmin languages");
       }
      Programming(String msg){
          System.out.println("I love "+msg);
      }

        public static void main(String[] args) {
            new Programming();
            new Programming("Java");
        }
    }
}
