package com.syntax.class15;

import java.util.Scanner;

public class HWRepl99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        givenString=givenString.replaceAll(" ","");
        boolean palindrome=true;

        StringBuilder givenStringBuilder=new StringBuilder(givenString);
        givenStringBuilder.reverse();
        String reversegivenString=givenStringBuilder.toString();


        if (givenString.equals(reversegivenString)){
            System.out.println(palindrome);
        }else{
            System.out.println(false);

        }

    }




}






