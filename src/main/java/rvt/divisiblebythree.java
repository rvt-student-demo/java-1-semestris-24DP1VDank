package rvt;

public class divisiblebythree {
    
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
       for(; beginning <= end; beginning++){
            if(beginning % 3 == 0){
                System.out.println(beginning);
            }
       }}}
