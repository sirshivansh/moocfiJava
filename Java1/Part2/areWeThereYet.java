// Write a program, that asks the user to input values until they input the value 4.

import java.util.Scanner;

public class areWeThereYet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.println("Give a number: ");
            int x = Integer.parseInt(sc.nextLine());
            if(x==4){
                break;
            }else{
                System.out.println(x);
            }
        }
        sc.close();
    }
}