// Write a program that reads two integers from the user.
// If the first number is greater than the second, the program prints "(first) is greater than (second)."
// If the first number is less than the second, the program prints "(first) is smaller than (second)." 
// Otherwise, the program prints "(first) is equal to (second)." 
// The (first) and (second) should always be replaced with the actual numbers that were provided by the user.

import java.util.Scanner;

public class comparingNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        int y = Integer.valueOf(sc.nextLine());

        if(x>y){
            System.out.println(x+" is greater than "+y);
        }else if(x<y){
            System.out.println(x+" is smaller than "+y);
        }else{
            System.out.println(x+" is equals to "+y);
        }
    }
}
