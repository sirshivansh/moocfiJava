// Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old or older).

import java.util.Scanner;

public class adulthood {
    Scanner sc = new Scanner(System.in);
    System.out.println("How old are you?");
    int x = Integer.valueOf(sc.nextLine());
    
    if(x>18){
        System.out.println("You are an adult");
    } else {
        System.out.println("You are not an adult");
    }
}
