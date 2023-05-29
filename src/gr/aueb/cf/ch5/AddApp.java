package gr.aueb.cf.ch5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Προσθέτει δύο ακεραίου με τη
 * χρήση της μεθόδου add
 */
public class AddApp {

    public static void main(String[] args) {
        int x;
        int y;
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide two numbers");
        x=in.nextInt();
        y=in.nextInt();
        sum=AddApp.add(x,y);
        System.out.println("Their sum is:"+sum);
    }
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
        }
}
