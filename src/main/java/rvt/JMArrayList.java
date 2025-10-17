package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        // OnlyTheseNumbers();

        ListSize();
    }


    public static void OnlyTheseNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array numbers, to stop: -1");
        int num = sc.nextInt();
        while (num != -1) {
            numbers.add(num);
            num = sc.nextInt();
        }
        System.out.print("From Where? ");
        int start = sc.nextInt();
        System.out.print("To Where? ");
        int end = sc.nextInt();

        for (int i = start; i < (end+1); i++){
            System.out.println(numbers.get(i));
        }

        sc.close();

    }


    public static void ListSize() {
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        sc.close();
    }
    public static void onTheList() {
        
    }
    public static void removeLast(ArrayList<String> strings) {
        
    }
    
}
