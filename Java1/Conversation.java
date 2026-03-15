// PART 1, 09

/*
Write a program that works as follows:

Sample output
Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!
*/

import java.util.Scanner;

public class Conversation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String a = sc.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String b = sc.nextLine();
        System.out.println("Thanks for sharing!");
    }
}