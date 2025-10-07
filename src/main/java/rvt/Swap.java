package rvt;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9};

        for (int i = 0 ; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println("Give two indices to swap:");
        int ind1 = sc.nextInt();
        int ind2 = sc.nextInt();
        int temp =  array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
        System.out.println("");
        for (int i = 0 ; i < array.length; i++)
            System.out.println(array[i]);
        
    }
}
