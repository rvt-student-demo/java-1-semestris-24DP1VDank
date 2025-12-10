package rvt;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// chapter 44
// chapter 44 uzdevums

public class Chapter_44 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Echo();
        //CharAt();
        Title_replier();
        Microwave_menu();
        //Documentation_printer();
        Password_checker();
        Word_triangle();
        
    }

    public static void Echo(){
        System.out.print("Enter your fullname: ");
        String fulname = sc.nextLine();

        int index_surname = fulname.indexOf(" ");
        String name = fulname.substring(0, index_surname);
        String surname = fulname.substring(index_surname).toUpperCase(); 
        System.out.println(name + surname);    
    }

    public static void CharAt(){
        System.out.print("Enter a String: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void Title_replier(){
        List<String> woman =  Arrays.asList("Amy", "Buffy", "Cathy");
        List<String> man =  Arrays.asList("Elroy", "Fred", "Graham");

        System.out.println("Enter a fullname: ");
        String fullname = sc.nextLine();
        int index_surname = fullname.indexOf(" ");
        String name = fullname.substring(0, index_surname);

        while(true){   
            if (fullname.isEmpty()) {
                break;
            }
            index_surname = fullname.indexOf(" ");
            name = fullname.substring(0, index_surname);
            if(woman.contains(name)){
                System.out.println("Ms. " + fullname);
            }
            else if(man.contains(name)){
                System.out.println("Mr. " + fullname);
            }
            else{
                System.out.println(fullname);
            }
            System.out.println("\nEnter a fullname: ");
            fullname = sc.nextLine();
        }
    }

    public static void Microwave_menu(){
        System.out.print("Enter cook time -> ");
        String time = sc.nextLine();
        
        if (time.length() <= 2){
            System.out.println("your time -> 0:" + time);
        }
        else if(time.length() <= 3){
            String seconds = time.substring(1, 3);
            String minutes = time.substring(0, 1);
            System.out.println("your time -> " + minutes + ":" + seconds); 
        }
        else if(time.length() <= 4){
            String seconds = time.substring(2, 4);
            String minutes = time.substring(0, 2);
            System.out.println("your time -> " + minutes + ":" + seconds); 
        }
    }

    public static void Documentation_printer() {
        boolean inBlock = false; 

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (line.trim().startsWith("//")) {
                System.out.println(line);
                continue;
            }

            if (line.trim().startsWith("/*")) {
                inBlock = true;
                System.out.println(line); 
                continue;
            }

            if (line.trim().startsWith("*/")) {
                System.out.println(line);
                inBlock = false;
                continue;
            }

            if (inBlock) {
                System.out.println(line);
            }
        }
    }

    public static void Password_checker(){
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        boolean digit = false;
        boolean uppercase = false;
        boolean lowercase = false;

        while(true){
            if(password.length() >= 7){
                for (int i = 0; i < password.length(); i++) {
                    char c = password.charAt(i);
                    if (Character.isUpperCase(c)) uppercase = true;
                    else if (Character.isLowerCase(c)) lowercase = true;
                    else if (Character.isDigit(c)) digit = true;
                }

                if (uppercase && lowercase && digit) {
                    System.out.println("Acceptable password.");
                    break;
                } else {
                    System.out.println("That password is not acceptable." + "\n\nEnter your password: ");
                    password = sc.nextLine();
                    digit = false;
                    uppercase = false;
                    lowercase = false;
                }
            } else {
                System.out.println("That password is not acceptable." + "\n\nEnter your password: ");
                password = sc.nextLine();
            }
        }
    }

    public static void Word_triangle(){
        System.out.print("Enter a word --> ");
        String word = sc.nextLine();

        int spaces = 0;

        while (!word.isEmpty()) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            System.out.println(word);

            if (word.length() > 1) {
                word = word.substring(1, word.length() - 1);
            } else {
                word = ""; 
            }

            spaces++;
        }
    }

}
