package com.company;
import java.util.Scanner;
import java.util.Random;
public class A15_practice_set_5 {
    public static void main(String[] args) {

//        0 for rock
//        1 for paper
//        2 for scissor

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter 0 for rock , 1 for paper , 2 for scissor");
        int userInput = Sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput) {
            System.out.println("draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("you win!");
        }
        else {
            System.out.println("computer win!");
        }
        System.out.println("computer coice:" + computerInput);


    }
}
