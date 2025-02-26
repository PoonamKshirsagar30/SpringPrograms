package com.strings.reversestrings;

import java.util.Scanner;

public class PrintChar {
    public static void main (String[] args) {

        //assigning the value
        String ch = "Anil";

        String s = new String (ch);
       char c =  s.charAt (0);
        System.out.println (c);

        //taking input by user
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the char: ");
        char chr = sc.next ().charAt (0);
        System.out.println (chr);

    }
}
