//Write a program that prompts the user for two integers and prints the larger of the two. 
//If the numbers are the same, then the program informs us about this as well.

import java.util.Scanner;

public class GreaterThanOrEqualTo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integers:");
        int x = Integer.valueOf(sc.nextLine());
        int y = Integer.valueOf(sc.nextLine());

        if(x>y){
            System.out.println("The larger number is: "+x);
        } else if (y>x) {
            System.out.println("The larger number is: "+y);
        } else {
            System.out.println("Both numbers are same");
        }
    }
}