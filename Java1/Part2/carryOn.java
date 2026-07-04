// Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
import java.util.Scanner;

public class carryOn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Shall we carry on?");
            String x = sc.nextLine();

            if(x.equals("no")){
                break;
            }
        }
    }
}
