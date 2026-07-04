// Write a program that reads two integers from the user and prints the square root of the sum of these integers.
// The program does not need to work with negative values.

import java.util.Scanner;

public class SqrtOfSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        int y = Integer.valueOf(sc.nextLine());

        double sqrt1 = Math.sqrt(x+y);
        System.out.println(sqrt1);
    }
}