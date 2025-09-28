import java.util.Scanner;

//4 businessmen in the city. take their august month income as user inputs. Find their avg monthly income.
//Every employee should pay 13% tax from their income. Find the total tax value they pay for the government.

public class Question2 {
    public static void main (String[] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the monthly income in August!");
        System.out.print("First businessmen: ");
        double income1 = scan.nextDouble();
        System.out.print("Second businessmen: ");
        double income2 = scan.nextDouble();
        System.out.print("Third businessmen: ");
        double income3 = scan.nextDouble();
        System.out.print("Fourth businessmen: ");
        double income4 = scan.nextDouble();

        System.out.println("The average monthly income is:"+ ((income1+income2+income3+income4)/4));

        System.out.println("The total tax value is:" + ((income1+income2+income3+income4)*13/100));
    }
}