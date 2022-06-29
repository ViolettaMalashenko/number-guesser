package com.violetta.numberguesser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create scanner for input values
        int computerNumber = (int) (Math.random() * 10); // set a random number from 1 to 10
        System.out.println("computer number =" + computerNumber);
        System.out.println("Input number from 0 to 9");
        int userNumber = sc.nextInt();// read input number


        while (userNumber != computerNumber) {
            System.out.println("You are wrong! Try again!");
            userNumber = sc.nextInt();
        }
        System.out.println("Well done! You guessed!");
    }
}