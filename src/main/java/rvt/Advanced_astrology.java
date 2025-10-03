package rvt;

import java.util.Scanner;

public class Advanced_astrology {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet cik atstarpes: ");
        int number = scanner.nextInt();
        printSpaces(number);
        printStars(number);
        printTriangle(number);
        printChristmasTree(number);
        scanner.close();
    }

    public static void printSpaces(int number){
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
        }

    public static void printStars(int number){
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
        }

    public static void printTriangle(int size){
        for(int i = 1; i <= size; i++){
        printSpaces(size- i);
        printStars(i);
        }}

    public static void printChristmasTree(int size){
        for(int i = 0; i <= size;i++){
            printSpaces(size- i);
            printStars(i*2 + 1);
        }
        for(int i = 0; i < 2; i++){
            printSpaces(size - 1);
            printStars(3);
        }
    }


}
