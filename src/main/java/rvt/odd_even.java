package rvt;

import java.util.Scanner;

public class odd_even {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your number: ");
        final int number = sc.nextInt();
        System.out.print("Your number is: ");
        if(number % 2 == 0) {
            System.out.println("Even");
        } 
        if (number % 2 == 1){
            System.out.println("Odd");
        }
}}

