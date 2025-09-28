//plug scanner
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        //scanner setup
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int val1 = scan.nextInt();

        System.out.print("Enter number 2 : ");
        int val2 = scan.nextInt();

        int answer = val1 + val2;
        System.out.println(answer);

        //string --> scan.next()
        //double --> scan.nextDouble()

        //arithmetic operators --> + - * / %

        //conversion ( Larger data type is converted into a smaller data type)
        byte num1 = 13;
        int num2 = num1;

        //casting ( Smaller data type is converted into a larger data type)
        int num3 = 67;
        short num4 = (short)num3;

        ///////////////////////////////////
        char num5 ='A';

        /// //////////////////////////


        int val=45;
        while (val>20){
            System.out.println("Hello...");

            if(true){
                break;
            }
        }

        /// //////////////

        int num6=12;
        do{
            System.out.println("Hi...");
        }while (num6>4);{

        }
        /// //////////////

        int[] ages = new int[10];

        System.out.println(ages[3]);

        ages[1]=10;
        ages[2]=15;
        ages[3]=12;
        ages[4]=15;

        /// ////////
        for (int i=0; i<10; i++){
            System.out.println(ages[i]);

        }

        /// ////////
        for (int i=0; i<10; i++){
            ages[i]=scan.nextInt();
        }

    }
}