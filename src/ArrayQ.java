import java.util.Scanner;

//student has 9 subjects for his OL exam
//get subject names & last term test marks and store them in a proper way
//find the max marked subject & find the average mark of te student

public class ArrayQ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the subject names: ");
        String[] subjects= new String[9];

        System.out.println("Enter the marks in an order: ");
        double[] marks = new double[9];

        for (int i=0; i<9;i++){
            System.out.print("Subject "+(i+1)+": ");
            subjects[i]=scan.next();
            System.out.print("Mark "+(i+1)+": ");
            marks[i]=scan.nextDouble();
        }

        double maxMark=0;
        int place=0;
        for(int i=0;i<9;i++){
            if(marks[i]>maxMark){
                maxMark=marks[i];
                place=i;
            }
        }
        System.out.println("The max marked subject name is: "+ subjects[place]);

        double totalMark=0;
        for (int i=0; i<9;i++){
            totalMark+=marks[i];
        }
        System.out.println("The average mark of the student is:"+ (totalMark/9));
    }
}