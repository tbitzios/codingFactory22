package gr.aueb.cf.Askiseis2isEvdomadas;

import java.util.Scanner;

public class Astreaki1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberofStars = 0;

        System.out.println("Please insert number of stars");
        numberofStars = in.nextInt();

        for(int n1=1; n1<=numberofStars; n1++) {
           for (int n2 =1; n2<n1; n2++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
