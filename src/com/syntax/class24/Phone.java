package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlock();
    void sendText(){
        System.out.println("use the messing app to send the msg");
    }

    }
class Iphoneextends extends Phone{
    @Override
    void displayPictures() {
        System.out.println("use the Photos app display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use FaceID to unlock the phone");
    }
}
 class Samsung extends Phone{


     @Override
     void displayPictures() {
         System.out.println("Use the Gallary to display the pictures");
     }

     @Override
     void unlock() {
         System.out.println("user Finger print or face unclock your phome");
     }
 }
class Tester {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.displayPictures();
    }
}