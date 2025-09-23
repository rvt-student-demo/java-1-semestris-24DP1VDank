package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ievaidet skruvju daudzumu:");
        final int skruvi = sc.nextInt();

        System.out.print("Ievaidet uzgrieznu daudzumu:");
        final int uzgriezni = sc.nextInt();

        System.out.print("Ievaidet paplāksnu daudzumu:");
        final int paplaksni = sc.nextInt();

        if (uzgriezni < skruvi) {
            System.out.println("Kļūda: Uzgriežņu jābut vienāds vai vairāk nekā skrūvi.");

        }else if (paplaksni < skruvi *2){
            System.out.println("Kļūda: Paplāksni jābu vismaz 2 reizes vairāk, neka skrūvus."); 
        } else {
            System.out.println("Pasūtījums kārtība.");
        }
        int price = skruvi * 5 + uzgriezni * 3 + paplaksni;
        System.out.println("Kopēja cena:  " + price);
    }
}
