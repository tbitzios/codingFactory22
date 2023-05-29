package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Εκτυπώνει n οριζοντια αστεράκια (10 φορές)
 * από ένα αστεράκι), με n ακέραιος που δίνει ο χρήστης
 */
public class Stars10App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i=0;
        int numberofStars=0;

        System.out.println("Please insert number of stars");
        numberofStars = in.nextInt();
        while (i<=numberofStars){
            System.out.printf("*");
            i++;
            if(i%50==0){
                System.out.println();
            }
        }
    }
}
