// Write a program that asks the user for a string, an integer, a floating-point number, and a boolean. 
// The program should then print the values given by the user.

import java.util.Scanner;

public class VariousInputs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Enter an integer: ");
        int x = Integer.valueOf(sc.nextLine());

        System.out.println("Enter a floating point number: ");
        double y = Double.valueOf(sc.nextLine());

        System.out.println("Enter a boolean value: ");
        boolean z = Boolean.valueOf(sc.nextLine());
        
        System.out.println("You gave the string "+s);
        System.out.println("You gave the integer "+x);
        System.out.println("You gave the double "+y);
        System.out.println("You gave the boolean "+z);

    }
}