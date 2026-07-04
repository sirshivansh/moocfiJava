// Write a program that reads an integer from the user. If the number is less than 0, 
// the program prints the given integer multiplied by -1. In all other cases, the program prints the number itself. 

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x<0){
            System.out.println(x*-1);
        }else{
            System.out.println(x);
        }
    }
}
