// Write a program that prompts the user for two strings. 
// If the strings are the same, then the program prints "Same". Otherwise, it prints "Different".

import java.util.Scanner;

public class same{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Strings!");

        String x = sc.nextLine();
        String y = sc.nextLine();

        if(x.equals(y)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}