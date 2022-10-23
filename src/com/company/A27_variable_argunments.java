package com.company;

public class A27_variable_argunments {
    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;

    }
   /* static int sum(int x, int ...arr){
//        x is compulsory one value
        int result=x;
        for(int a: arr){
            result += a;
        }
        return result;
    } */
    public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is " + sum(4, 5));
        System.out.println("the sum of 4, 5 and 6 is " + sum(4, 5, 6));
        System.out.println("the sum of 4, 5, 6 and 7 is " + sum(4, 5, 6, 7));
        System.out.println("the sum of nothing is " + sum());
        System.out.println("the sum of 1 is " + sum(1));
    }
}
