package com.syntax.class22;

public class AdvanceCalc {
    void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    void sum(int num1, int num2, int num3, int num4) {
        System.out.println(num1 + num2 + num3 + num4);
    }
static void sum (int ... arr){
    System.out.println("1");

    System.out.println(arr[3]);

    for (int i=0; i<arr.length;i++){
        System.out.print(arr[i]);

        int sum =0;
        for (int y=0; y<arr.length;y++){
            sum+=arr[y];
            System.out.println(sum);
        }

    }

}

    public static void main(String[] args) {
        sum(2,2,3,4,10);
        int age =10;
        String name;
        if (age>18){
           name="Time to go work";
        }else{
            name="Enjoy no work";
        }
        System.out.println(name);

        String name2=age>18?"Time to go work":"Enjoy no work";
        System.out.println(name2);

        String name3=age>18? age>10? "nested in":"it is nested else":"Enjoy no Work";
        System.out.println(name3);



    }
}
