package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n αλλά
 * με μέθοδο (Facto)
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int result;
        int result2;

        System.out.println("Please insert n (int)");
        n=in.nextInt();
        result=FactorialApp.Facto(n);
        result2=AddApp.add(n,n);
        System.out.println("The Factorial of n is:"+result);
        System.out.println("The Add of n is:"+result2);
    }

    /**
     * Επιστρέφει το n Factorial
     * @param n the number n of n!
     * @return 1*2*3..*n
     */
    public static int Facto(int n){
        int result=1;
        for(int i=1;i<=n; i++){
            result*=i;
        }
        return result;
    }
}
