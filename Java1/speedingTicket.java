// Write a program that asks user for an integer and prints the string "Speeding ticket!" if the input is greater than 120.

import java.util.Scanner;

public class speedingTicket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Speed:");
        int x = sc.nextInt();
        if(x>120){
            System.out.println("Speeding Ticket!");
        }
    }
}
