// Write a program that reads an integer from the user and prints the square of the given integer, ie the integer multiplied by itself.

import java.util.Scanner;

public class squared {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int x = Integer.valueOf(sc.nextLine());
        int y = x*x;
        System.out.println("The square of "+x+" is "+y);
    }
}
