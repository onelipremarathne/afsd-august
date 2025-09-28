import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the salary of employee 1");
        double salary1= scan.nextDouble();
        System.out.println("Enter the salary of employee 2");
        double salary2= scan.nextDouble();
        System.out.println("Enter the salary of employee 3");
        double salary3= scan.nextDouble();
        System.out.println("Enter the salary of employee 4");
        double salary4= scan.nextDouble();
        System.out.println("Enter the salary of employee 5");
        double salary5= scan.nextDouble();

        System.out.println("Average: "+(salary1+salary2+salary3+salary4+salary5)/5);

        /// ////////////////

        double totalSalary=0.0;
        for (int i=0; i<500;i++){
            System.out.print("Enter employee salary");
            totalSalary+= scan.nextDouble();

            if(totalSalary>=1000000){
                break;
            }
        }
    }
}
