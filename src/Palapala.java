import java.util.Scanner;

public class Palapala {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String dbEmail= "admin@gmail.com";
        int dbPassword= 12345;

        System.out.println("Get your දවසේ ලග්න පලාපල! :)");

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

                System.out.print("Enter your name: ");
                String name = scan.next();
                System.out.print("Enter your age: ");
                int age = scan.nextInt();
                System.out.print("Enter your ලග්න: ");
                String lagna = scan.next();

                String lucky;
                String result;

                if (age < 18) {
                    System.out.println("Age is not enough!");
                } else {
                    char firstLetter = name.charAt(0);

                    if (firstLetter % 2 == 1) {
                        lucky = "වාසනාවන්තයෙකි";
                    } else {
                        lucky = "අවාසනාවන්තයෙකි";
                    }

                    switch (lagna) {
                        case "Aries":
                            result = "යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්.";
                            break;
                        case "Taurus":
                            result = "අන් අයගේ සිත් දිනා ගනී";
                            break;
                        case "Gemini":
                            result = "සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම්";
                            break;
                        case "Cancer":
                            result = "අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි.";
                            break;
                        case "Lion":
                            result = "වස්තුව සහ සැප සම්පත් ලඟා වේ";
                            break;
                        case "Virgo":
                            result = "දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම";
                            break;
                        case "Libra":
                            result = "හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය.";
                            break;
                        case "Scorpio":
                            result = "විවාහය අපේක්ෂකයින් ශුභයි";
                            break;
                        case "Sagittarius":
                            result = "රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය";
                            break;
                        case "Capricorn":
                            result = "අධ්යාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට";
                            break;
                        case "Aquarius":
                            result = "පවුලේ සමගිය සහ සතුට";
                            break;
                        case "Pisces":
                            result = "ඔබේ දක්ෂතා ක්රියාවෙන්ම ඔප්පු කර පෙන්වීමට";
                            break;
                        default:
                            result = "ඔබේ ලග්නය වැරදී";
                    }
                    System.out.println(name + " ඔබ " + lucky + ". ඔබේ දවසේ ලග්න පලාපලය " + result + ".");

                    break;
                }
            }
        }
    }
}