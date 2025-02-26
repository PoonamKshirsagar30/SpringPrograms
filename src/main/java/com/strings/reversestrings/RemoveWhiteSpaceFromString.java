package com.strings.reversestrings;

public class RemoveWhiteSpaceFromString {
    public static void main (String[] args) {
        String str = "  j  a  va  s  ta   r   ";

        String str1 = str.replaceAll ("\\s","");
        System.out.println (str1);

    }
}
