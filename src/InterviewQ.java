import java.util.Scanner;

public class InterviewQ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Grade Calculator! :)");
        System.out.print("Enter your grade: ");
        int mark = scan.nextInt();

        if (mark >= 75) {
            System.out.print("Your grade is A");
        } else if (mark >= 65) {
            System.out.print("Your grade is B");
        } else if (mark >= 45) {
            System.out.print("Your grade is C");
        } else {
            System.out.print("Your grade is F");
        }
        System.out.println("hii");
    }
}