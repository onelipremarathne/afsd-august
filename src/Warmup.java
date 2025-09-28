//There are 12 employees im ABC pvt ltd.
//If any employee's salary is greater than 130,000 he should pay 14% tax
//find the amount of the tax collected from this company for government
import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalTax=0;
        for (int i = 0; i<12 ; i++){
            System.out.print("Enter the "+ (i+1)+" salary: ");
            double salary= scan.nextDouble();

            if(salary>130000){
                totalTax+=salary*14/100;
            }
        }
        System.out.println("The total tax collected is: "+totalTax);
    }
}