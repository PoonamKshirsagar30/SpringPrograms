package com.strings.reversestrings;

public class RemoveSpecialCharFromSting {
    public static void main (String[] args) {

        String str = "$ja!va$i*s&ast%ar";

        //Approach-1 using replaceAll() of String class
       String plainString = str.replaceAll ("[^a-zA-Z0-9]", "");
        System.out.println (plainString);

        System.out.println (" ");


    }
}
