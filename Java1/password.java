// Write a program that prompts the user for a password.
// If the password is "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!"

import java.util.Scanner;

public class password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Password?");
        String x = sc.nextLine();
        String y = "Caput Draconis";
        
        if(x.equals(y)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}