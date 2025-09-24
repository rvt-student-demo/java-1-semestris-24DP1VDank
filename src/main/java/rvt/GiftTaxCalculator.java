package rvt;
import java.util.Scanner;

public class GiftTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of the gift (€): ");
        double giftValue = scanner.nextDouble();

        
        System.out.print("Is the donor a close relative/family member? (yes/no): ");
        String relation = scanner.next();

        if (giftValue < 5000) {
            System.out.println("No gift tax required.");
        } else {
            double tax = 0;

            if (relation.equalsIgnoreCase("yes")) {
                
                if (giftValue <= 25000) {
                    tax = 100 + (giftValue - 5000) * 0.08;
                } else if (giftValue <= 55000) {
                    tax = 1700 + (giftValue - 25000) * 0.10;
                } else {
                    tax = 4700 + (giftValue - 55000) * 0.13;
                }
            } else {
                
                if (giftValue <= 25000) {
                    tax = 100 + (giftValue - 5000) * 0.10;
                } else if (giftValue <= 55000) {
                    tax = 2100 + (giftValue - 25000) * 0.13;
                } else {
                    tax = 6000 + (giftValue - 55000) * 0.16;
                }
            }

            System.out.println("Gift tax to be paid: €" + tax);
        }

        scanner.close();
    }
}
