package rvt;

import java.util.Scanner;

public class Repeating_breaking_remembering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        while ( num != -1){
            sum += num;
            count += 1;
            if (num % 2 == 0){
                even += 1;
            }
            else {
                odd++;
            }
            num = sc.nextInt();
            
        }
        float average = (float)sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even + "\nOdd: " + odd);
        sc.close();
    }
}
