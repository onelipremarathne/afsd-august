import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String dbEmail= "admin@gmail.com";
        int dbPassword= 12345;

        for (int i=0; i<5; i++) {
            System.out.print("Enter your email: ");
            String userEmail = scan.next();
            System.out.print("Enter your password: ");
            int userPassword = scan.nextInt();

            if (!(userEmail.equals(dbEmail)) || !(userPassword == dbPassword)){
                System.out.println("Login Failed! ");
            }
            if(i==4){
                System.out.println("Account is locked :(");
            }
            if (userEmail.equals(dbEmail) && userPassword == dbPassword) {
                System.out.println("Login Success! :) ");
                break;
            }
        }
    }
}