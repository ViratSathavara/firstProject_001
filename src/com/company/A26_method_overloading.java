package com.company;

public class A26_method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static int change(int a){
        a = 98;
        return a;
    }

    static int change2(int [] arr){
        arr[0] = 98;
        int a = 0;
        return a;
    }

    static void telljoke(){
        System.out.println("What lights up a soccer stadium?");
    }
    public static void main(String[] args) {
//        telljoke();
//        int [] marks = {52, 73, 77, 98, 89, 94};
//      case 1:- changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("the value of x after running change is:" + x);

//        case 2:- changing the array
//        int [] marks = {52, 73, 77, 98, 89, 94};
//        change2(marks);
//        System.out.println("the value of x after running change is:" + marks[0]);

//        method overloading
foo();
foo(30000);
        foo(30000, 40000);
    }
}
