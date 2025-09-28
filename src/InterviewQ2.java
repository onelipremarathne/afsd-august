import java.util.Scanner;
public class InterviewQ2 {
    public static void  main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name");
        String name= scan.next();
        System.out.print("Enter your Physics marks");
        int physics=scan.nextInt();
        System.out.print("Enter your Chemistry marks");
        int chemistry=scan.nextInt();
        System.out.print("Enter your Maths marks");
        int maths= scan.nextInt();

        int average=(physics+chemistry+maths)/3;
        System.out.println("Your Average mark is:"+ average);
        }
    }