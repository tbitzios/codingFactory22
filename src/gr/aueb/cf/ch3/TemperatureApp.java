package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * APOFASIZEI AN XIONIZEI ME BASI
 * TH THERMOKRASIA. AN H TJERMOKRASIA
 * EINAI <0, TOTE XIONAEI, ALLIWS
 * THA AGORASOYME.O XRISTIS PLERW
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing=false;
        int temp=0;

        System.out.println("Please insert current temp");
        temp=in.nextInt();

        isSnowing = (temp<0);
        System.out.println("Is sinoewing:" + isSnowing);
    }
}
