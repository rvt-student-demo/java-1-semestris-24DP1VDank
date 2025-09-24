package rvt;

import java.util.Scanner;

public class Grades_points {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your points: ");
        final int points = sc.nextInt();
        sc.close();
        System.out.print("Your grade is: ");
        if(points < 0) {
            System.out.println("impossible!");
        } 
        if (points > 0 && points < 50){
            System.out.println("failed");
        }
        if(points >= 50 && points < 60) {
            System.out.println(1);
        }
        if (points >= 60 && points < 70) {
            System.out.println(2);
        }
         if (points >= 70 && points < 80) {
            System.out.println(3);
        }
         if (points >= 80 && points < 90) {
            System.out.println(4);
        }
         if (points >= 90 && points < 100) {
            System.out.println(5);
        }
        if (points > 100) {
            System.out.println("Incredible!");
        }
        
}
}

