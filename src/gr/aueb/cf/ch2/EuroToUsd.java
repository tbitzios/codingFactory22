package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroToUsd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //dilosi kai arxikopoisi
        int inputEuros= 0;
        int totalUseCents=0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;


        //entles
        System.out.println("please insert an amount in euros");
        inputEuros = scanner.nextInt();

        totalUseCents = inputEuros * PARITY;
        usaDollars = totalUseCents/100;
        usaCents = totalUseCents % 100;

        //ektiposi apotelesmatwn output
        System.out.printf("%d Euros= %d usaDollars , %s Usa cents", inputEuros ,usaDollars , usaCents);



    }
}
