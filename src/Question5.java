import java.util.Scanner;

public class Question5 {
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Get your love reading! :)");

        System.out.print("Enter the guy's age: ");
        int boyAge= scan.nextInt();
        System.out.print("Enter the girl's age: ");
        int girlAge= scan.nextInt();

        if(boyAge<girlAge){
            System.out.println("Bandinna wenne na :P ");
        }
        else if(boyAge==girlAge){
            System.out.println("Think twice!");
        }
        else{
            System.out.print("Enter the name of the boy: ");
            String boyName=scan.next();
            System.out.print("Enter the name of the girl: ");
            String girlName=scan.next();

            char letter1= boyName.charAt(0);
            char letter2= girlName.charAt(0);

            if(letter1>letter2){
                System.out.println("Definitely MARRYYYY!!!");
            }
            else{
                System.out.println("maybe.....");
            }
        }
    }
}