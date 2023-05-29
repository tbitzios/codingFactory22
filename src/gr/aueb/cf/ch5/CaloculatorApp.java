package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
* ilopoiei enan aplo calculator
* kai parexei tis ipresies add sub mul div mod
* emfanizei menu pros ton xristi
* lamvanei  tin timi tis epilogis
* kai sti sinexeia dio akoma times ton num1 num2
* kai telika emfanizei apotelesma
*  */
public class CaloculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result= 0;


        do {
            printMenu();
            choice = getNextInt("please insert your choicde");

            //validation

            if (isChoiceInvalid(choice)) {
                System.out.println("choice invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }

            result = onChoiceGetResult(choice);
            System.out.println(result);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("epilekste ena apo ta parakatw");
        System.out.println("1. Prosthesi");
        System.out.println("2. Afairesi");
        System.out.println("3. Polaplasiasmos");
        System.out.println("4. Diairesi");
        System.out.println("5. Ypoloipo");
        System.out.println("6. Exodos");
    }


    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();

    }


    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;

    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {

        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("please insert the first number(int)");
        int num2 = getNextInt("please insert the second number(int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }
        return result;
    }


}




