package gr.aueb.cf.ch8;

import java.util.Scanner;

public class InputMissmatchExeptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iputNum;
        final int MagicNum=12;

        while(true){
            System.out.println("Please insert a num");

            iputNum = in.nextInt();

            if(iputNum==MagicNum){
                System.out.println("Great");
                break;
            }
        }
        System.out.println("Thanks fo using the Magic App");
    }
}
