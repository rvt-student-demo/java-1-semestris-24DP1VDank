package rvt;


import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = sc.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = sc.nextDouble();

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        int ekspress = sc.nextInt();

        sc.close();

        if (cena < 10 && ekspress == 0){
            double piegade = 2.00;
            double summa = cena + piegade; 
            System.out.println("Rekins:\n\t" + prece + "\t" + cena + "\n\tpiegāde\t"+ piegade + "\n\tkopā:\t" +  summa);

        }else if(cena < 10 && ekspress == 1) { 
            double piegade = 5.00;
            double summa = cena + piegade; 
            System.out.println("Rekins:\n\t" + prece + "\t" + cena + "\n\tpiegāde\t"+ piegade + "\n\tkopā:\t" +  summa);
        }else if (cena >= 10 && ekspress == 1) { 
            double piegade = 3.00;
            double summa = cena + piegade; 
            System.out.println("Rekins:\n\t" + prece + "\t" + cena + "\n\tpiegāde\t"+ piegade + "\n\tkopā:\t" +  summa);
        }
        else if (cena >= 10 && ekspress == 0){
            double piegade = 0;
            double summa = cena + piegade; 
            System.out.println("Rekins:\n\t" + prece + "\t" + cena + "\n\tpiegāde\t"+ piegade + "\n\tkopā:\t" +  summa);
        }


        
}       
}
        