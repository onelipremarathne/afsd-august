import java.util.Scanner;

public class SirsAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "admin@gmail.com";
        int dbPassword = 12345;
        System.out.print("Enter email : ");
        String email = scan.next();

        boolean isLoginSuccess = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter password : ");
            int password = scan.nextInt();

            if (dbEmail.equals(email) && dbPassword == password) {
                isLoginSuccess = true;
                break;
            }
            if (i == 4) {
                System.out.println("Account Locked !");
                break;
            }
            System.out.println("Password incorrect try again !. (Rounds Remaining : " + (4 - i) + ")");
        }
        if (isLoginSuccess) {
            //logical part
            System.out.println("hi");
        }
    }
}