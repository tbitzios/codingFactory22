package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένα έτος είναι δίσεκτο
 * όπου δίσεκτο σμαίνει το έτος να διαιρείται με το 4,
 * να μη διαιρείται με το 100 και να διαιρείται με το 100
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int year=0;
        boolean isleap=false;

        System.out.println("Please provide the year (int)");
        year=in.nextInt();
        isleap= year % 4==0 &&(year%100!=0 || year%400==0);

        System.out.println(isleap);

        if (year%4==0){
            if(year%100!=0){
                isleap=true;
            }else if(year%400==0){
                isleap=true;
            }
        }
    }
}
