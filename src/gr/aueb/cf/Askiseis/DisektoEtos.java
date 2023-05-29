package gr.aueb.cf.Askiseis;

import java.util.Scanner;

public class DisektoEtos {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int year=0;

        System.out.println("Please insert a random year");
        year=in.nextInt();
                 if (year % 4!=0){
                     System.out.println("Το %d είναι ένα συνηθισμένο έτος");}
                else if (year % 100!=0){
                    System.out.println("To %d είναι ένα δίσεκτο έτος");}

                 else if (year % 400==0)
                     System.out.println("To %d είναι ένα συνηθισμένο έτος");
                 else
                     System.out.println("To %d είναι ένα δίσεκτο έτος");
    }
}
