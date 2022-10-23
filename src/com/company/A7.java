package com.company;

public class A7 {
    public static void main(String[] args) {
//        precedence & associativity
        int a = 6*5-34/2;
//        check associacivity in left to right order
        /*
        =30-34/2
        =30-17
        =13
        */
        int b = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
        */
        System.out.println(a);
        System.out.println(b);

//        quick quiz

        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

        int e = 4;
        int d = 9;
        int c = 1;
        int  g = d*d - (4*e*c)/(2*e);
        System.out.println(g);
    }
}
