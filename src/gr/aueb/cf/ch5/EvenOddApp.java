package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
*apofasizei an enas arithmos eina artios i peritos*/
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;


        System.out.println("please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even " + isNumEven);
    }

    /*
     *evaluates an int if it ids even or not
     *
     * @param n   the number (int) to evaluate
     * @return    true , if n is even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
        //i allios mporw na to grpasw k etsi

        //        if (n%2==0){
//            return true;
//        }else {
//            return false;
//        }
//    }

    }
}
