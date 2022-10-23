package com.company;

public class A11_conditional_if_else {
    public static void main(String[] args) {
        int age = 18;
        boolean cond = (age==18);
        if (age>18)
        {
            System.out.println("yes boy you can drive!");
        }
        else {
            System.out.println("No boy you cannot drive yet!");
        }
        if (cond){
            System.out.println("yes boy you can drive!");
        }
        else {
            System.out.println("No boy you cannot drive yet!");
        }
    }
}
