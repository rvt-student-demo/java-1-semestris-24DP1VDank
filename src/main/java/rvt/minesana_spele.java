package rvt;

import java.util.Random;
import java.util.Scanner;

public class minesana_spele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess = random.nextInt(10) + 1; // случайное число от 1 до 10
        int attempts = 3; // количество попыток
        boolean isCorrect = false;

        System.out.println("Es domāju par skaitli no 1 līdz 10.");
        System.out.println("Tev tas jāuzmin trīs mēģinājumos.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Ievadi minējumu: ");
            int answer = sc.nextInt();

            if (answer == guess) {
                System.out.println("PAREIZI!");
                isCorrect = true;
                break;
            } else {
                System.out.println("Nepareizi");
            }
        }

        if (isCorrect) {
            System.out.println("Tu esi uzvarējis spēli.");
        } else {
            System.out.println("Tu neuzminēji.");
            System.out.println("Pareizais skaitlis bija: " + guess);
        }

        sc.close();
    }
}