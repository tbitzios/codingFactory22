package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Υπολογίζει το γινόμενο των 10
 * πρώτων ακεραίων
 */
public class SumAndMul10App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n=0;

        System.out.println("Please insert the n");
        n=in.nextInt();
        while(i<=n){
            i=i*n;
            i++;

        }
        System.out.println("n " + n);

    }
}
