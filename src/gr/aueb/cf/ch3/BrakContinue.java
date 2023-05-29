package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Deixnei ti xrisi ton break kai
 * continue
 */
public class BrakContinue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =0;
        int sum=0;

        while(true){
            System.out.println("Please provide a num");
            num=in.nextInt();

            if (num==5){
                continue;
            }
            sum=sum+num;
            if (num==10){
//                System.out.println("bingo!!!");
                break;
            }
        }
        System.out.println("Sum:"+sum);
    }
}
