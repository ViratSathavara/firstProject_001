package com.company;

public class a19_BREAK_AND_CONTIUNE {
    public static void main(String[] args) {
        int i;
        for (i=0;i<10;i++){
            System.out.println(i);
            System.out.println("java is great!");
            if (i==3) {
                System.out.println("ending the loop!");
                break;
            }
        }

        int j=0;
        while(j<5){
            System.out.println(j);
            System.out.println("java is wonderful");

        if (j==4){
            System.out.println("ending the loop!");
            break;
        }
        j++;
        }

        int k;
        for (k=0;k<10;k++){
            System.out.println(k);
            System.out.println("java is great!");
            if (k==3) {
                System.out.println("ending the loop!");
                continue;
            }
        }

        int a=0;
        while(a<5){
            System.out.println(a);
            System.out.println("java is wonderful");

            if (a==4){
                System.out.println("ending the loop!");
                continue;
            }
            a++;
        }



        int m=0;
        do {
            m++;
            if (m == 4) {
                System.out.println("ending the loop!");

                continue;
            }
            System.out.println(m);
            System.out.println("java is wonderful");
        }
            while(m<5);
        System.out.println("lops and here!");

    }
}
