import java.util.Scanner;

public class MatchingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name= scan.next();
        System.out.print("Enter your age: ");
        int age= scan.nextInt();

        char asciiUser= name.charAt(0);

        System.out.println("Enter the name and age to check if they are a match!");

        for (int i=0; i<10; i++){
            System.out.print("Enter name "+ (i+1)+" : ");
            String namePerson=scan.next();
            System.out.print("Enter their age: ");
            int agePerson= scan.nextInt();

            char asciiPerson=namePerson.charAt(0);

            if(asciiUser<=asciiPerson && agePerson<age){
                System.out.print(namePerson+" is a match!");
                break;
            }
            else {
                System.out.print(namePerson + " is not a match!\n");
            }
            if(i==9){
                System.out.println("Any of the users are not eligible for you! :( ");
            }
        }
    }
}