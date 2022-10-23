package com.company;
import java.util.Scanner;
public class A14_practice_set_4 {
    public static void main(String[] args) {

/* Question 1 : What will be the output of this program:
int a = 10;
if (a=11)                                        --> solution  =  '=='
        System.out.println(“I am 11”);
else
        System.out.println(“I am not 11”);*/


//        int a = 10;
//        if (a == 11) {
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

//        Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least
//        33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
//        byte m1,m2,m3;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("enter your marks in maths");
//        m2 = sc.nextByte();
//        System.out.println("enter your marks in chemistry");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("your overall persentage is :" + avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("congratulation, you have been promoted");
//        }
//        else {
//            System.out.println("sorry, you have not  been promoted");
//        }

// Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//
//Income Slab	Tax
//2.5L – 5.0L  	5%
//5.0L – 10.0L 	20%
//Above 10.0L	30%
//Note that there is not tax below 2.5L. Take the input amount as input from the user.
/*
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter your income in lakhs:");
        float tax = 0;
        float income = Sc.nextFloat();
        if (income <= 2.5){
            tax = tax + 0;
        }

       else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
         else   if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (income - 5.0f);
            tax = tax + 0.2f * (5f - 2.5f);
         }
             if (income > 10.0f) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (10f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);

             }
        System.out.println("the total text paid by the emloyyee is:"+ tax);  */

// Question 4: Write a Java program to find out the day of the week
// given the number [1 for Monday, 2 for Tuesday … and so on!]


//        System.out.println("enter 1 to 7 any value:");
//        Scanner She = new Scanner(System.in);
//        int day = She.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }
//        Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.

//        int year;
//        System.out.println("enter your year:");
//        Scanner yer = new Scanner(System.in);
//        year = yer.nextInt();
//        if (year % 400 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else if (year % 100 == 0) {
//            System.out.println(year + " is not a leap year.");
//        } else if (year % 4 == 0) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }

//Question 6:Write a program to find out the type of website from the URL:
//
//.com – commercial website
//.org – organization website
//.in – Indian website

        Scanner web = new Scanner(System.in);
         String website = web.next();
         if (website.endsWith(".org")){
             System.out.println("this is an organizational website.");
         }
         else if (website.endsWith(".com")){
             System.out.println("this is an commercial website.");
         }
         else if (website.endsWith(".in")){
             System.out.println("this is an indian website.");
         }

    }
}
