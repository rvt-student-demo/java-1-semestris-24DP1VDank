package rvt;

import java.util.*;

public class JMArrayList {
    static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        OnlyTheseNumbers();
        ListSize();
        onTheList();
        removeLast(strings);
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

        for (int i = start; i <= end; i++){
            System.out.println(numbers.get(i));

        }
        sc.close();
    }


    public static void ListSize() {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        while (!text.isEmpty()) {
            list.add(text);
            text = sc.nextLine();
        }

        System.out.println();
        System.out.println("In total: " + list.size());
        sc.close();
    }



    public static void onTheList() {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        while (!text.isEmpty()) {
            list.add(text);
            text = sc.nextLine();
        }

        System.out.print("\nSearch for? ");
        String search = sc.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
        sc.close();
    }


    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }
    }
}
