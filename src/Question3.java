import java.util.Scanner;

public class Question3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Get your lucky numbers! :) ");
        System.out.print("Enter the name of the boy: ");
        String boyName= scan.next();
        System.out.print("Enter the name of the girl: ");
        String girlName=scan.next();

        char firstLetter= boyName.charAt(0);
        char lastLetter= girlName.charAt(girlName.length()-1);

        System.out.println("The lucky number is: "+(((int) firstLetter + (int) lastLetter)/2));
    }
}