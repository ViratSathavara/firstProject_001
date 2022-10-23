package com.company;
import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        System.out.println("values");
        Scanner sc = new Scanner(System.in);
        String stri = sc.next();
//        --> only one word
        System.out.println(stri);
//        --> full sentence
        String striw = sc.nextLine();
//        --> only one word
        System.out.println(striw);
//        --> full sentence
    }
}
