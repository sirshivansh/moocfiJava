// Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater than zero).

import java.util.Scanner;

public class positivity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give an Integer:");
        int x = Integer.valueOf(sc.nextLine());

        if(x > 0){
            System.out.println("Integer is Positive!");
        } else {
            System.out.println("Integer is Not Positive!");
        }
    }
}
