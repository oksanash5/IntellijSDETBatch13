package com.syntax.class21;

public class Repl130 {
    //If the number is even, divide it by 2. If it's odd, multiply it by 10.
    // should print out 10 1 30 2 50
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
            }else {
                a[i]=a[i]*10;
            }
            System.out.print(a[i]+" ");
        }
    }
}