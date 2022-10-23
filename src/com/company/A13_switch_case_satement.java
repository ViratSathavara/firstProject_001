package com.company;
import java.util.Scanner;

public class A13_switch_case_satement {
    public static void main(String[] args) {

//        char var = 'r';
        String var = "virat";

        switch (var) {
            case "het" ->  // --> for char 'r'
                    System.out.println("you are going to become an adult!");
            case "virat" ->  // --> for char 'c'
                    System.out.println("you are going to join a job!");
            case "subhan" -> // --> for char 'd'
                    System.out.println("you are going to get retired!");
            default -> System.out.println("enjoy your life");
        }

        System.out.println("thsnks for yusing my Java code!");

//        first case
/*
        int age;
        System.out.println("enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("you are experienced!");
        }
        else if (age>46) {
            System.out.println("you are semi-experienced!");
        }
        else if (age>36) {
            System.out.println("you are semi-semi-experienced!");
        }
        else {
            System.out.println("you are not experienced!");
        } */


    }
}
