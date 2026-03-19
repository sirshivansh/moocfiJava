// Create a program that can be used to add two integers together. In the beginning, 
// the user is asked to give two integers that are to be summed. 
// The program then prints the formula that describes the addition of the numbers.

import java.util.Scanner;

class Data
{
    int a, b, sum;
}

class Input
{
    void input(Data d)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        d.a = sc.nextInt();
        System.out.println("Enter Second Number:");
        d.b = sc.nextInt();
    }
}

class AddFormula
{
    void formula(Data d)
    {
        d.sum = d.a+d.b;
        System.out.println(d.a+" + "+d.b+"= "+d.sum);
    }
}

public class AdditionFormula 
{
    public static void main(String args[])
    {
        Data d = new Data();

        Input ip = new Input();
        ip.input(d);

        AddFormula af = new AddFormula();
        af.formula(d);
    }
}
