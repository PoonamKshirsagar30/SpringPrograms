package com.strings.reversestrings;

public class ReverseString {
    public static void main (String[] args) {
        String name = "Anil";
        System.out.println ("--------------Approach 1---------------");
        //Approach-1 using toCharArray()

        char[] chName  = name.toCharArray ();

        for (int i = chName.length-1; i >= 0; i--)
        {
            System.out.print (chName[i]);
        }
        System.out.println (" ");
        System.out.println ("--------------Approach 2---------------");
        //Approach-2 using charAt()

        for (int i = name.length ()-1; i >= 0 ; i--)
        {
            System.out.print (name.charAt (i));
        }
        System.out.println (" ");

        System.out.println ("--------------Approach 3---------------");
        //Approach-3 using reverse() of stringbuffer
        StringBuffer sb = new StringBuffer (name);
        System.out.println ( sb.reverse ());

        System.out.println (" ");
        System.out.println ("--------------Approach 4---------------");
        //Approach-4 using reverse() of string builder
        StringBuilder sb1 = new StringBuilder (name);
        System.out.println (sb1.reverse ());;
    }
}
