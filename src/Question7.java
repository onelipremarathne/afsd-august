import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your salaries!");
        double[] salary= new double[8];

        for (int i=0; i<8;i++){
            System.out.print("Salary "+(i+1)+": ");
            salary[i]= scan.nextDouble();
        }

        double[] newSalary= new double[8];
        for (int i=0; i<8;i++){
            if(salary[i]>130000){
                newSalary[i]=salary[i]+(salary[i]*12/100);
            }
            else{
                newSalary[i]=salary[i];
            }
        }
        double totalBefore=0;
        for (int i=0; i<8;i++){
            totalBefore+=salary[i];
        }

        double total=0;
        for (int i=0; i<8;i++){
            total+=newSalary[i];
        }
        System.out.println("The total over cost is: "+(total-totalBefore));
    }
}