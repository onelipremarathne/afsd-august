import java.util.Scanner;

public class Question4 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Income Calculator :) ");

        System.out.print("Please enter your salary: ");
        double salary = scan.nextDouble();
        System.out.print("Please enter your land income: ");
        double landMoney = scan.nextDouble();
        System.out.print("Please enter your kudu income: ");
        double kuduSalli = scan.nextDouble();

        if(salary>=115000){
            salary*= 86.0/100;
        }
        if(kuduSalli>0){
            kuduSalli=kuduSalli/2;
        }
        System.out.println("Your final income after the deductions is: "+(salary+landMoney+kuduSalli));
    }
}