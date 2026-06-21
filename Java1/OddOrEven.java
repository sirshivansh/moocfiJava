// Write a program that prompts the user for a number and informs us whether it is even or odd.

import java.util.Scanner;

public class OddOrEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = Integer.valueOf(sc.nextLine());

        if(x%2 == 0){
            System.out.println(x+" is Even");
        } else {
            System.out.println(x+" is Odd");
        }
    }
}