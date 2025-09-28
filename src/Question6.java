import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Check if you are eligible for the interview! :)");

        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("Are you married, true or false: ");
        boolean isMarried = scan.nextBoolean();

        if (age < 18) {
            System.out.println("You are not eligible, age is not enough.");
        } else {
            char letter = name.charAt(0);
            if (letter >= 70 && isMarried) {
                System.out.println("You are eligible for the interview! :)");
            } else {
                System.out.println("You are not eligible for the interview! :( ");
            }
        }
    }
}