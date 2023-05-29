package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
o xrisstis dinei dipsifio akeraio
kai vriskoyme to athrisma twn 2 psifiwn
 */
public class IntTwoDigitsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0 ;
        int leftdigit = 0;
        int rightdigit = 0;
        int sum = 0;

        System.out.println("please insert a num with 2 digits");
        num = in.nextInt();
        leftdigit = num / 10;
        rightdigit = num % 10;

        sum= leftdigit+rightdigit;
        System.out.println("sum:" + sum);
    }

}
