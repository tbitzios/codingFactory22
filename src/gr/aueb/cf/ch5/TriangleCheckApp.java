package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Τσεκάρω αν ένα τρίγωνο
 * είναι ορθογώνιο
 */
public class TriangleCheckApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON=0.000005;

        System.out.println("Please insert the a μία πλευρά");
        a=in.nextInt();
        System.out.println("Please insert the b δεύτερη πλευρά");
        b=in.nextInt();
        System.out.println("Please insert the c υποτίνουσα");
        c=in.nextInt();
        if(Math.abs(c*c-a*a+b*b)<=EPSILON) {
            System.out.println("Το τρίγωνο είναι ορθογώνιο");
        }else {
            System.out.println("Το τρίγωνο δεν είναι ορθογώνιο");
        }
    }
}
