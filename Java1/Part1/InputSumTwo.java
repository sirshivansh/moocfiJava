// Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by the user.
// When you ask for multiple numbers, create a separate variable for eac

import java.util.Scanner;

class Data
{
    int a,b,sum;
}

class UserInput
{
    void insert(Data d)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        d.a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        d.b = sc.nextInt();
    }
}

class Sum
{
    void sum(Data d)
    {
        d.sum = d.a+d.b;
        System.out.println("The Sum of Two Numbers is: "+d.sum);
    }
}

public class InputSumTwo
{
    public static void main(String args[])
    {
        Data d = new Data();

        UserInput ui = new UserInput();
        ui.insert(d);

        Sum s = new Sum();
        s.sum(d);
    }
}