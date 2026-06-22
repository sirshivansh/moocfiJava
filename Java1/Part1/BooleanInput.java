// Write a program that asks the user for a boolean value. The program should then print the value provided by the user.

import java.util.Scanner;

public class BooleanInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Boolean Value: ");
        Boolean x = Boolean.valueOf(sc.nextLine());

        System.out.println("You wrote "+x);
    }
}