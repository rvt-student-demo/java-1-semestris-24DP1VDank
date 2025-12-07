package rvt;
import java.util.Scanner;


public class Statistics {
    private int count;
    private int sum = 0;
    private int sum_odd = 0;
    private int sum_even = 0;
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter numbers:");
        int num = sc.nextInt();
        while(num != -1){
            statistics.addNumber(num); 
            num = sc.nextInt();
        }

        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statistics.sum_even());
        System.out.println("Sum of odd numbers: " + statistics.sum_odd());
        sc.close();
    }

        public Statistics() {
        }
    
        public void addNumber(int number) {
           count += 1;
           sum += number;
           if(number % 2 == 0) {
            sum_even += number;
           }
           else {
            sum_odd += number;
           }
        }
    
        public int getCount() {
            return count;
        }

        public int sum() {
            return sum;
        }

        public double average() {
            return (double) sum / count;
        }

        public int sum_odd() {
            return sum_odd;
        }
        public int sum_even() {
            return sum_even;
        }
    }
