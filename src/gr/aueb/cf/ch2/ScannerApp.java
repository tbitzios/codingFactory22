package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
diavazei apo ton xristi 2 akeraious kai tous prosthetei

 */
public class ScannerApp {
    public static void main(String[] args) {
       //dilosi kai arxikopoisi
        Scanner in  = new Scanner(System.in); //dilonw to pliktrologio
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // entoles
        System.out.println("Please insert to ints"); // zitaw apo ton xristi na balei mia timi
        num1= in.nextInt();
        num2= in.nextInt();
        sum = num1 + num2;

       // ektiposi apotelesmaton
        System.out.printf("%d, %d, %d", num1 , num2, sum);

    }
}
