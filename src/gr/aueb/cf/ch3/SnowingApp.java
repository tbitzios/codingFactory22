package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
apofasizei oxi mono an xionizei
alla kai an vrexei
an vrexei kai i thermokrasia inai mikroteri apo to 0 toe xionizei
allliw oxi
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean issnowing = false ;
        boolean israining = false;
        int temp = 0 ;

        System.out.println("please insert if its raining");
        israining = in.nextBoolean();

        System.out.println("please insert temperature (int)" );
        temp = in.nextInt();

        issnowing = israining && (temp < 0);

        System.out.println("is snowing  " + issnowing);


    }
}
