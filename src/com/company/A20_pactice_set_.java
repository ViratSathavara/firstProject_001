package com.company;

public class A20_pactice_set_ {
    public static void main(String[] args) {

//        Question 1: Write a program to print the following pattern :
//
//****
//
//***
//
//**
//
//*

//        int n = 4;
//        for (int i=n;i>0;i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");    //  --> println nahi hoga
//            }
//
//            System.out.print("\n");       //  --> println nahi hoga
//        }

//        Question 2: Write a program to sum first n even numbers using a while loop.
//        int sum = 0;
//        int p = 4;
//        for (int i=0;i<n;i++){
//            sum = sum + (2*i);
//        }
//
//        System.out.println("sum of even number is:");
//        System.out.println(sum);

//        sum of even number : 0, 2, 4, 6.

//
//        int p = 5;
//        for (int i=1;i<=10;i++){
//
//            System.out.printf("%dX%d = %d\n", n,i,n*i);
//        }
//

//        Question 4: Write a program to print a multiplication table of 10 in reverse order.


//        int n = 10;
//        for (int i=10;i>=1;i--){
//            System.out.printf("%dX%d = %d\n", n,i,n*i);
//        }
//

//        Question 5: Write a program to find the factorial of a given number using for loops.
//
//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);


//        Question 6: Repeat problem 5 using a while loop.

//        what is factorial = n * n-1 * n-2 * ... * 1

//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

//        Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

        int n = 8;
        int sum = 0;

        for (int i=1; i<=10; i++){
            sum += n*i;

        }
        System.out.println(sum);
    }

}
