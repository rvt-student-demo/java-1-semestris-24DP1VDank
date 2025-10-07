package rvt;

public class print_in_stars {
    public static void main(String[] args){
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array){
        for(int column = 0; column < array.length; column++ ){
            for(int i = 0; i < array[column]; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
