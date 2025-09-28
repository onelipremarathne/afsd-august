// cricket players 11.
//allplayers, run score, user inputs, save
//average score of a player
//highest score

import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the run scores of the 11 players in an order: ");

        int[] score = new int[11];
        for (int i=0; i<11;i++){
            score[i]= scan.nextInt();
        }

        int total=0;
        for (int i=0; i<11;i++){
            total=total+score[i];
        }
        System.out.print("The average score is: "+(total/11)+"\n");

        int maxMark=score[0];
        for(int i=0; i<11;i++){
            if(score[i]>maxMark){
                maxMark=score[i];
            }
        }
        System.out.print("The highest score is:"+ maxMark);
        System.out.println("Hello");
    }
}
