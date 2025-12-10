package rvt;
import java.util.ArrayList;
import java.util.Scanner;
// java-moc: 4-2
// Books uzdevums

public class Books {
    String title;
    int pages;
    int publ_year;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>(); 
        while(true){
        System.out.print("Title: ");
        String title = sc.nextLine();
        
        if (title.isEmpty()) {
            break;
        }    

        System.out.print("Pages: ");
        Integer pages = Integer.valueOf(sc.nextLine());
        System.out.print("Publication year: ");
        int publ_year = Integer.valueOf(sc.nextLine());

        books.add(new Books(title, pages, publ_year));
        }

        System.out.print("What information will be printed? ");
        String info = sc.nextLine();
        if(info.equals("everything")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i));
            }
        }
        if(info.equals("name")){
            for(int i = 0; i < books.size(); i++){
                System.out.println(books.get(i).title);
            }
        }
        sc.close();
    }


    public Books(String title, int pages, int publ_year){
        this.title = title;
        this.pages = pages;
        this.publ_year= publ_year;
    }
    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publ_year;
    }
}