// SpeedingTicket.java
// Write a program that asks the user for an integer and prints the string "Speeding ticket!" if the input is greater than 120.

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give speed:");
        int a = sc.nextInt();

        if(a>120){
            System.out.println("Speeding Ticket!");
        } else {
            System.out.println("No speeding ticket!");
        }
    }
}