package com.company;

public class A23_multi_dimantional_arrays {
    public static void main(String[] args) {
        int [] marks;  // --> 1 - d array
        int [][] flats; // -->  - d array
        flats = new int[5][4];
//        5-rows and 4-columns
        flats [0][0]= 001;
        flats [0][1]= 002;
        flats [0][2]= 003;
        flats [0][3]= 004;
        flats [1][0]= 101;
        flats [1][1]= 102;
        flats [1][2]= 103;
        flats [1][3]= 104;
        flats [2][0]= 201;
        flats [2][1]= 202;
        flats [2][2]= 203;
        flats [2][3]= 204;
        flats [3][0]= 301;
        flats [3][1]= 302;
        flats [3][2]= 303;
        flats [3][3]= 304;
        flats [4][0]= 401;
        flats [4][1]= 402;
        flats [4][2]= 403;
        flats [4][3]= 404;

//        displaying the 2-D array using for loop
        System.out.println("printing using for loop");
        for (int i=0;i<flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
