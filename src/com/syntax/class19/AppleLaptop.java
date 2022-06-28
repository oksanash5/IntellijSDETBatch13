package com.syntax.class19;

import com.syntax.class20.Laptop;

public class AppleLaptop extends Laptop {
    void printMake(){
        //  can not acces because we are in different package
        //  if you change String to protected in Laptop class we can

      System.out.println(make);

    }

}
