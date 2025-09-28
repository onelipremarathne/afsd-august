
import java.util.Scanner;

public class TelcoApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String username= "Oneli";
        int password= 12345;

        System.out.println("Good Morning!");
        System.out.print("Enter your username: ");
        String un=scan.next();
        System.out.print("Enter your password: ");
        int pw =scan.nextInt();

        if(username.equals(un)&& password==pw) {
            System.out.print("Enter the count of people for today: ");
            int count = scan.nextInt();

            int dialogCount = 0;
            int mobitelCount = 0;
            int airtelCount = 0;

            for (int i = 0; i < count; i++) {
                System.out.print("How many sim cards do you have?: ");
                int simNo = scan.nextInt();

                for (int j = 0; j < simNo; j++) {
                    System.out.print("Enter sim " + (j + 1) + " : ");
                    String simType = scan.next();

                    switch (simType) {
                        case "Dialog":
                            dialogCount += 1;
                            break;
                        case "Mobitel":
                            mobitelCount += 1;
                            break;
                        case "Airtel":
                            airtelCount += 1;
                            break;
                        default:
                            System.out.println("Sim not in the list.");
                    }
                }
            }

            if (mobitelCount > airtelCount && mobitelCount > dialogCount) {
                System.out.println("The populest sim for today is 'Mobitel'");
            } else if (dialogCount > mobitelCount && dialogCount > airtelCount) {
                System.out.println("The populest sim for today is 'Dialog'");
            } else {
                System.out.println("The populest sim for today is 'Airtel'");
            }
        }
        else{
            System.out.println("Wrong credentials!");
        }
    }
}