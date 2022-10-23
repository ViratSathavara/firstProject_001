package com.company;

public class A22_for_each_loop {
    public static void main(String[] args) {
//        int [] marks = {95, 67, 78, 98, 56};
   /*     float [] marks = {95.5f, 67.5f, 78.5f, 98.5f, 56.5f};
        System.out.println(marks.length);
        System.out.println(marks[4]);
        String [] students = {"virat","kevin","smit","dev","dhruv","piyush"};
        System.out.println(students.length);
        System.out.println(students[4]); */

        int [] marks = {95, 67, 78, 98, 56};
        System.out.println("printing using naive method");

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

//        displaying the arrat using for loop
        System.out.println("printing using for loop");
        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }

//            displaying the array in reverse order using for loop
            System.out.println("printing using for loop in reverse order");
            for (int i=marks.length -1;i>=0;i--){
                System.out.println(marks[i]);

//                displaying the array using for each loop
                System.out.println("printing using for for loop");
                for (int element : marks){
                    System.out.println(element);
                }

        }

    }
}
