// Write a program that prompts the user for an integer and prints the string "Orwell" if the number is exactly 1984.

import java.util.Scanner;

public class orwell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number: ");
        int x = Integer.valueOf(sc.nextLine());

        if(x == 1984){
            System.out.println("Orwell");
        }
    }
}