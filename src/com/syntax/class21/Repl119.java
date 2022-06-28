package com.syntax.class21;

public class Repl119 {
    static String censorLetter(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                str.replaceAll("str.charAt(i)", "*");

            }

        }

        return str;

    }

    public static void main(String[] args) {
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));

    }
}