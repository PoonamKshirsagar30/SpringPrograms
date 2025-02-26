package com.strings.reversestrings;

import java.util.stream.Collectors;

public class RemoveSpecialCharFromSting {
    public static void main (String[] args) {

        String str = "$ja!va$i*s&ast%ar";

        //Approach-1 using replaceAll() of String class
       String plainString = str.replaceAll ("[^a-zA-Z0-9]", "");
        System.out.println (plainString);

        System.out.println (" ");

        //Approach-2 using java8
        String str1 = "Hello, World! @2025";
        String cleanedStr = str1.chars()
                .filter(c -> Character.isLetterOrDigit(c) || Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(cleanedStr);

    }
}
