package com.strings.reversestrings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main (String[] args) {

        String str = "programming";

        //Approach-1 using java 8
        StringBuilder sb = new StringBuilder ();
        str.chars ().distinct ().forEach (c -> sb.append((char)c));
        System.out.println (sb);

        //Approach-2 using indexOf() of String class
        StringBuilder sb1 = new StringBuilder ();
        for (int i = 0; i < str.length (); i++)
        {
            char ch = str.charAt (i);
           int idx = str.indexOf (ch, i+1);
           if (idx == -1)
           {
               sb1.append (ch);
           }
        }
        System.out.println (sb1);

        //Approach-3
        char[] arr = str.toCharArray ();
        StringBuilder sb2 = new StringBuilder ();

        for (int i = 0; i < arr.length; i++)
        {
            boolean repeate = false;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    repeate = true;
                    break;
                }
            }
            if (!repeate)
            {
                sb2.append (arr[i]);
            }
        }
        System.out.println (sb2);

        //Approach-4 set interface
        StringBuilder sb3 = new StringBuilder ();
        Set<Character> set = new LinkedHashSet<> ();
        for (int i = 0; i < str.length (); i++)
        {
            set.add (str.charAt (i));
        }
        for (Character c : set)
        {
            sb3.append (c);
        }
        System.out.println (sb3);
    }
}
