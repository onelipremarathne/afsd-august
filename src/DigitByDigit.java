import java.util.Scanner;

public class DigitByDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int numX=1;

        while (numX>0){
            int rem= number%10;
            numX= (number-rem)/10;
            number=numX;
            System.out.println(rem);
        }
    }
}
