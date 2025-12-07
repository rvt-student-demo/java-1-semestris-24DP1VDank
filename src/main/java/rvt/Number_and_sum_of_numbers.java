package rvt;

import java.util.Scanner;

public class Number_or_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = sc.nextInt();
        int sum = 0;
        int reizes = 0;
        while(num != 0){
            sum += num;
            num = sc.nextInt();
            reizes += 1;
        }
        System.out.println("Nuumber of numbers: " + reizes);
        System.out.println("Sum of the numbers: " + sum);
        sc.close();
}
    
}