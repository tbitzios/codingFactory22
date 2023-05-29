package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;


import java.util.Scanner;

/**Αποφασίζει αν πρέπει να ανάψουν τα φώτα
 * ενός αυτοκινήτου με βάση τρεις μεταβλητές
 * ανβρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχισοτν
 * από τα επόμενα : είναι σκοτάδι Ή τρέχουμε
 * (speed > 100) .Τις τιμές αυτές τις λαμβάνουμε
 * από τον χρήστη (stain)
 */
public class LightsOnApp {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    boolean isRaining = false;
    boolean isDark = false;
    boolean isRunning = false;
    int speed=0;
    boolean lightson= false;

    System.out.println("Please insert if it is raining (true/false)");
    isRaining = in.nextBoolean();

    System.out.println("Please insert if it is dark");
    isDark = in.nextBoolean();

    System.out.println("Please insert car speed(int)");
    speed = in.nextInt();

    isRunning = (speed >100);
    lightson=isRaining && (isDark || isRunning);

    System.out.println("Lights On:" + lightson);

    }

}
