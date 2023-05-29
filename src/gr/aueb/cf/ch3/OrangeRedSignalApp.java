package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Ένα αεροσκάφος έχει δύο δεξαμενές
 * Αν μία δεξαμενή έχει λιγλοτερο από 1/4
 * καύσημα τότε ανάβει πορτοκαλί
 * σήμα, ενώ αν και οι δύο δεξαμενές
 * έχουν <1/4 τότε ανάβει κόκκινο σήμα.
 * Οπιλότος δίνει true or false
 * ανάλογα αν tank<1/4 ή όχι, αντίστοιχα
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean OrangeOn=false;
        boolean redOn = false;

        System.out.println("Please insertr if tank1, tank2 less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        OrangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + OrangeOn);
        System.out.println("Redon" + redOn);

    }
}
