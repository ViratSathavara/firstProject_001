package com.company;

public class A12_logical_operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        boolean x = true;
        boolean y = true;
        boolean z = true;
        if (x && y && z){         //  --> left to right asosiativity
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
