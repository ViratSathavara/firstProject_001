package com.company;

import java.util.Locale;
//string methods
public class A9_string {
    public static void main(String[] args) {
        String name  = "Virat"; //  name is a variable.
        System.out.println(name);

//        name.length
        int value = name.length(); // in this case the integer value outpot is 5 because the string name that is extracted from it has 5 leters and it shows its length.
        System.out.println(value);

//        name.tolowercase
        String lrcase = name.toLowerCase(); // in this case all upper case letters convert into lowercase.
        System.out.println(lrcase);

//        name.touppercase
        String uprcase = name.toUpperCase(); // in this case all upper case letters convert into uppercase.
        System.out.println(uprcase);
//       name.trin
        String nontrimstring = "    virat    ";
        System.out.println(nontrimstring);
        System.out.println(nontrimstring.trim()); //in this case all space are removed.

//        name.substring
        System.out.println(name.substring(2)); //In this case we have put 2 input then substring will show the initial letters like zero one two starting from two till the last letter in the string named virat above it.
        System.out.println(name.substring(2,4));  // this output is starting point is 2 it means 'i' and ending point is 4 it means'a'.
        System.out.println(name.substring(2,5)); // this output is starting point is 2 it means 'i' and ending point is 5 it means't'.

//        name.replace
        String rpname  = "Harry";
        System.out.println(rpname.replace('r', 'p'));
        System.out.println(rpname.replace("Harry", "virat"));

//        name.startswith
        System.out.println(name.startsWith("Vi"));
        System.out.println(name.startsWith("ha"));

//        name.endswith
        System.out.println(name.endsWith("at"));
        System.out.println(name.endsWith("ry"));

//        name.charAt
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));

//        name.indexof
        System.out.println(rpname.indexOf("ry"));
        System.out.println(rpname.indexOf("r"));

//        name.indexof / name.lastindexof
        String modifiedname = "harryrry";
        System.out.println(modifiedname.indexOf("rry"));
        System.out.println(modifiedname.indexOf("rry", 4));
        System.out.println(modifiedname.indexOf("rryfgk2", 4));
        System.out.println(modifiedname.indexOf("rry23fgk2"));
        System.out.println(modifiedname.lastIndexOf("rry"));
        System.out.println(modifiedname.lastIndexOf("rry", 4));

//        name.equals / name.equalsignorecase
        System.out.println(name.equals("Virat"));
        System.out.println(name.equals("virat"));
        System.out.println(name.equalsIgnoreCase("vIrAt")); // ignore uppercase or lowercase only match value
        System.out.println(name.equalsIgnoreCase("viraat"));

//        escape sequence characters
       // System.out.println("i am a escape sequence " double quote "); --> this code is shows error
        System.out.println("i am a escape sequence \" double quote ");

        /* escape sequence characters are
        \n , \t , \f , \b , \r , \' , \" , \\ , etc
        */

    }
}
