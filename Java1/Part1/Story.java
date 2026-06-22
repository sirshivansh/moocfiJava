// PART 1, 10
/*
Write a program that asks the user for a character's name and their job. The program then prints a short story.

The output must be as shown below — note, the name and job depend on the user's input.

Sample output
I will tell you a story, but I need some information first.
What is the main character called?
Bob
What is their job?
a builder
Here is the story:
Once upon a time there was Bob, who was a builder.
On the way to work, Bob reflected on life.
Perhaps Bob will not be a builder forever.
*/


import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String a = scanner.nextLine();
        System.out.println("What is their job?");
        String b = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+a+", who was "+b+".");
        System.out.println("On the way to work, "+a+" reflected on life.");
        System.out.println("Perhaps "+a+" will not be "+b+" forever.");
    }
}

