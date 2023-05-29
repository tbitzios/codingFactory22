package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
diavazei wres lepta k deftera
kai metatrepei se defterolepta
 */
public class SecondsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = 0;
        int min = 0;
        int sec = 0;
        int totalsecs = 0;
        final int sec_per_hour = 3600;
        final int sec_per_minute = 60;

        System.out.println("pelase insert hours minutes and seconds");
        hour = in.nextInt();
        min = in.nextInt();
        sec = in.nextInt();



        totalsecs = hour*sec_per_hour + min +sec_per_minute +sec;


        System.out.printf("%d hours %d minutes %d seconds = % total", hour , min , sec, totalsecs );


    }

}
