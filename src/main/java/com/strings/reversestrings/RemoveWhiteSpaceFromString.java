package com.strings.reversestrings;

import java.util.stream.Collectors;

public class RemoveWhiteSpaceFromString {
    public static void main (String[] args) {
        String str = "  j  a  va  s  ta   r   ";

        String str1 = str.replaceAll ("\\s","");
        System.out.println (str1);

        //Approach-2 using java8
        String name = " Hello, world! @2025";

        String noSpaceString = name.chars ()
                .filter (c-> !Character.isWhitespace(c))
                .mapToObj (c-> String.valueOf ((char)c))
                .collect(Collectors.joining ());
        System.out.println (noSpaceString);
    }
}
