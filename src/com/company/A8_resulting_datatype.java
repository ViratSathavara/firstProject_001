package com.company;
import java.util.Scanner;
public class A8_resulting_datatype {
    public static void main(String[] args) {
//        que 1
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

//        que 2

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

//        decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

//        que 3
        System.out.println("enter value :-");
        Scanner Sc = new Scanner(System.in);
        int g = Sc.nextInt();
        System.out.println(g>50);
    }
}
