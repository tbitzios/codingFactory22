package gr.aueb.cf.Askiseis2isEvdomadas;

import java.util.Scanner;

public class AsterakiKatheta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int numberofStars = 0;

        System.out.println("Please insert number of stars");
        numberofStars = in.nextInt();

        while (n <= numberofStars) {
            System.out.println("*");
            n++;
        }
    }
}
