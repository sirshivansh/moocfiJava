/* The table below describes how the grade for a particular course is determined. 
Write a program that gives a course grade according to the provided table.

points	grade
< 0  	impossible!
0-49	failed
50-59	1
60-69	2
70-79	3
80-89	4
90-100	5
> 100	incredible!

*/

import java.util.Scanner;

public class GradesAndPoints{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int x = Integer.valueOf(sc.nextLine());

        if(x<0){
            System.out.println("Grade: "+"impossible!");
        } else if (x<50) {
            System.out.println("Grade: "+"failed");
        } else if (x<60) {
            System.out.println("Grade: "+"1");
        } else if (x<70) {
            System.out.println("Grade: "+"2");
        } else if (x<80) {
            System.out.println("Grade: "+"3");
        } else if (x<90) {
            System.out.println("Grade: "+"4");
        } else if (x<=100) {
            System.out.println("Grade: "+"5");
        } else {
            System.out.println("Grade: "+"incredible!");
        }
    }
}