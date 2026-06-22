// Similar to the previous exercise of Addition Formula, 
// create a program that multiplies the values stored in two integer variables.

import java.util.Scanner;

class Data
{
    int a,b, mul;
}

class UserInput
{
    void input(Data d)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        d.a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        d.b = sc.nextInt();
    }
}

class DoMulti
{
    void multiply(Data d)
    {
        d.mul = d.a*d.b;
        System.out.println(d.a+" * "+d.b+" = "+d.mul);
    }
}

public class MultiplicationFormula
{
    public static void main(String args[])
    {
        Data d = new Data();

        UserInput ui = new UserInput();
        ui.input(d);

        DoMulti m = new DoMulti();
        m.multiply(d);
    }
}