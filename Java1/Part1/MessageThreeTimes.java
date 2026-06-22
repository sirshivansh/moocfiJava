import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter your message: ");
        String message = sc.nextLine();

        System.out.println();
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
