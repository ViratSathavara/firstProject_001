package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class A6_project {
    public static void main(String[] args) {
// question1
        System.out.println("input marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks");
        int a = sc.nextInt();
        System.out.println("Enter second subject marks");
        int b = sc.nextInt();
        System.out.println("Enter third subject marks");
        int c = sc.nextInt();
        System.out.println("Enter forth subject marks");
        int d = sc.nextInt();
        System.out.println("Enter fifth subject marks");
        int e = sc.nextInt();
        float sum = (a +b +c +d +e )/ 5 ;
        System.out.println("total persantage is :-");
        System.out.println(sum);

//question2 --> WAP to calculate CGPA using marks of three subjects (out of 100) .

        int sub1 = 60;
        int sub2 = 90;
        int sub3 = 80;
        System.out.println("cgpa marks is :-");
        float marks = (sub1 + sub2 + sub3)/30;
        System.out.println(marks);

//        question3

        System.out.println("what is your name?");
        Scanner Sc = new Scanner (System.in);
        String name = sc.next();
        System.out.println("hello "  + name +  " have a good day!");

//        question4 --> kilometers to miles

        float miles =0.621371f;
        Scanner Scc = new Scanner(System.in);
        System.out.println("enter kilometer value:");
        int value = sc.nextInt();
        float variable = value * miles;
        System.out.println("miles value is :-");
        System.out.println(variable);

//        question5 --> number is integer or not
        System.out.println("enter your number");
        Scanner bc = new Scanner (System.in);
        System.out.println(sc.hasNextInt());

    }
}
