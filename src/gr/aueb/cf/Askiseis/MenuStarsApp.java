package gr.aueb.cf.Askiseis;

import java.util.Scanner;

public class MenuStarsApp {
    public static void main(String[] args) {
        int n;
        int a;
        Scanner in = new Scanner(System.in);
        do {
        Menu();
        System.out.println("Δώσε επιλογή:");
        a = in.nextInt();
        System.out.println("Δώστε αριθμό για αστεράκια:");
        n = in.nextInt();
        LinearStars(n,a);
        VerticalStars(n,a);
        }while(a>0 && a<6);
    }
    public static void VerticalStars(int n,int a) {
        if (a == 2) {
            for (int i = 1; i <= n; i++) {
                System.out.println("*");
            }
        }
    }
    public static void Menu(){
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");

    }
    public static void LinearStars(int n,int a){
        if (a == 1) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }else if(a==3){
            for(int n1=1; n1<=n; n1++) {
                for (int n2 = 1; n2 <= n; n2++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }else if(a==4){
            for(int n1=1; n1<=n; n1++) {
                for (int n2 =1; n2<=n1; n2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(a==5){
            for(int n1=1; n1<=n; n1++) {
                for (int n2 =n; n2>=n1; n2--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}

