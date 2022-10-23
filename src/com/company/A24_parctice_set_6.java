package com.company;

import java.awt.geom.Arc2D;

public class A24_parctice_set_6 {
    public static void main(String[] args) {
/*    1.Create an array of 5 floats and calculate their sum.
        float [] marks = {98.4f, 34.7f, 56.9f, 87.4f, 78.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is:" + sum);


//      2. Write a program to find out whether a given integer is present in an array or not.
       float [] marks = {98.4f, 34.7f, 56.9f, 87.4f, 78.0f};
        float num = 98.4f;
        boolean isInArray = false;
        for (float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in the array");
        }
        else
        {
            System.out.println("the value is not present in the array");
        }
//      3.  Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

        float [] marks = {98.4f, 34.7f, 56.9f, 87.4f, 78.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of average marks is:" + sum/marks.length);

//        4. Create a Java program to add two matrices of size 2x3.
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{3, 12, 30},
                {24, 25, 16}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }


//       5. Write a Java program to reverse an array.

        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element +" ");
        }


//        6. Write a Java program to find the maximum element in an array.
        int [] arr = {1,212,302,486,5,59,123,53};
        int max = 0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("the value of the maximum element in this array is " +max);

 */

        boolean isSorted = true;
        int [] arr = {1,2,3,4,5,9,13,53};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }

    }
}