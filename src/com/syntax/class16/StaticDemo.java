package com.syntax.class16;

public class StaticDemo {

   static int noOfEmployees=10;
    String name;
    static void method1(){
        System.out.println(noOfEmployees);
         //  System.out.println(name);  error  because each odject will be having
        //a separate copy of this name variable java ets confused
    }
void method2(){
    System.out.println(noOfEmployees);
    System.out.println(name); // no error  because it instance not static
}
public static void main (String[] args){
    StaticDemo st=new StaticDemo();
    st.name="Omid";

    StaticDemo st2=new StaticDemo();
    st.name="Rachid";
}
}
