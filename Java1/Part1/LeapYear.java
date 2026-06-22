// A year is a leap year if it is divisible by 4.
// However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int x = Integer.valueOf(sc.nextLine());
        if(x%100 == 0 && !(x%400 == 0)){
            System.out.println(x+" is not a Leap Year");
        } else if (x%100 == 0 && x%400 == 0){
            System.out.println(x+" is a Leap Year");
        } else if (x%4 == 0){
            System.out.println(x+" is a Leap Year");
        }else{
            System.out.println(x+" is not a Leap Year");
        }
    }
}