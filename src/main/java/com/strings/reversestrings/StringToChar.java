package com.strings.reversestrings;

public class StringToChar {
    public static void main (String[] args) {

        String greeting = "Hello world";
        char[] ch = greeting.toCharArray ();

        for (char chr : ch)
        {
            System.out.print (chr + " ");
        }
    }
}
