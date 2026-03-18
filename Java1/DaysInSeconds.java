// In the exercise template, implement a program that asks the user for the number of days. 
// After that, the program prints the number of seconds in the given number of days.

// DONE USING OOPS CONCEPTS

import java.util.Scanner;

class Data
{
    int inp;
    int sec;
}

class UserInput
{
    void Input(Data d)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days you want in seconds?");
        d.inp = sc.nextInt();
    }

}
class Calculate
{
    void calc(Data d)
    {
        d.sec = d.inp*24*60*60;
    }
}
class Display
{
    void show(Data d)
    {
        System.out.println(d.sec);
    }
}

public class DaysInSeconds
{
    public static void main(String args[])
    {
        Data d = new Data();

        UserInput ui = new UserInput();
        ui.Input(d);

        Calculate c = new Calculate();
        c.calc(d);

        Display disp = new Display();
        disp.show(d);
    }
}