// Write a program that asks the user for three numbers. 
// After this the program prints the sum of the numbers given by the user.
import java.util.Scanner;

class Data
{
    int a, b, c, sum;
}
class Input
{
    void input(Data d)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        d.a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        d.b = sc.nextInt();

        System.out.println("Enter third Number: ");
        d.c = sc.nextInt();
    }
}

class Sum
{
    void sum(Data d)
    {
        d.sum = d.a+d.b+d.c;
        System.out.println("The sum of three numbers is: "+d.sum);
    }
}

class InputSumThree
{
    public static void main(String args[])
    {
        Data d = new Data();

        Input ip = new Input();
        ip.input(d);

        Sum s = new Sum();
        s.sum(d);
    }
}