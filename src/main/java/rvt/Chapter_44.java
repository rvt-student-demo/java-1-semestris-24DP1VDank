package rvt;
import java.util.Scanner;


// chapter 44
// chapter 44 uzdevums


public class Chapter_44 {
    public static void main(String[] args) {
    // Echo();
    CharAt();
    }


    public static void Echo(){
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String fulname = sc.nextLine();

        //String fulname = "Laalalla Kkfsdlfj";
        int index_surname = fulname.indexOf(" ");
        String name = fulname.substring(0, index_surname);
        String surname = fulname.substring(index_surname).toUpperCase(); 
    System.out.println(name + surname);    
    sc.close();
    }

    public static void CharAt(){
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));

        }
        sc.close();
    }}

