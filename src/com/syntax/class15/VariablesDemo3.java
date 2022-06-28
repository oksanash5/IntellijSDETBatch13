package com.syntax.class15;

public class VariablesDemo3 {
    static int num = 5;
    String name;

    public static void main (String[]  args){
        VariablesDemo3 v1=new VariablesDemo3();
        v1.name="Naveed";

        VariablesDemo3 v2=new VariablesDemo3();
        v2.name="Jason";

        VariablesDemo3 v3=new VariablesDemo3();
        v3.name="Muntaz";

        System.out.println(v1.name);
      //  System.out.println(v1.num);//5

        v1.num=10;  //updated from 5 to 10 fro all objects // static var.
        v1.name="Sameer"; // don't updated the varib// instance ver

        System.out.println(v2.name);
        System.out.println(v1.num);//5

    }
}
