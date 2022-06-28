package com.syntax.class16;

public class InstanceDemo {
    String str="instance";
    void changeInstanceValue(){
        str="Capitan Marvel";
    }
    void printInstanceValue (){
        System.out.println(str);

    }
public static void main(String[] args){
    InstanceDemo id=new InstanceDemo();
    System.out.println(id.str);//instance
    id.printInstanceValue();//instance
    id.changeInstanceValue(); //Capitan Marvel
    id.printInstanceValue();// Capitan Marvel
}
}
