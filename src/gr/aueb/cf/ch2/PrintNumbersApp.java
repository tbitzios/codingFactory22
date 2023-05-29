package gr.aueb.cf.ch2;

import java.util.Scanner;

//zitaei apo ton xristi 3 akeraious
//tous meionei kata 1 monada
//kai tous emfanizei me tin idia seira pou dothokan
//afinontas ena keno anamesa tous
public class PrintNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("please insert the integers" );
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();


        num1 -= -1 ;
        num2 -- ; //to idio me to pano
        num3 -- ; // afairei kata 1
        System.out.printf("%d %d %d", num1,num2,num3);

    }
}
