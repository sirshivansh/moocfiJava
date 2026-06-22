// Write a program that prompts the user for a year. 
// If the user inputs a number that is smaller than 2015, then the program prints the string "Ancient history!".

import java.util.Scanner;

public class ancient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Year:");
        int x = Integer.valueOf(sc.nextLine());
        
        if(x < 2015){
            System.out.println("Ancient History!");
        }
    }
}
