package com.company;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
//        1
        System.out.println("taking input from the user:- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a  = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum  = a +b;
        System.out.println("the sum of this two nmbers is:-");
        System.out.println(sum);
//        2
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.next();
        System.out.println(str);


    }
}
