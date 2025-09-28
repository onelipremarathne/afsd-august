import java.util.Scanner;

//There are 4 employees in a company, get their salaries as user inputs and find the avg

public class Question1 {
    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the salaries of the first employee: ");
        double emp1 = scan.nextDouble();
        System.out.print("Enter the salaries of the second employee: ");
        double emp2 = scan.nextDouble();
        System.out.print("Enter the salaries of the third employee: ");
        double emp3 = scan.nextDouble();
        System.out.print("Enter the salaries of the fourth employee: ");
        double emp4 = scan.nextDouble();

        System.out.println("The average salary is = "+((emp1 + emp2 + emp3 + emp4) / 4));
    }
}