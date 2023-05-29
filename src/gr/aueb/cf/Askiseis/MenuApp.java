package gr.aueb.cf.Askiseis;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;

        System.out.println("1. Εισαγωγή");

        System.out.println("2. Διαγραφή");

        System.out.println("3. Ενημέρωση");

        System.out.println("4. Αναζήτηση");

        System.out.println("5. Έξοδος");


        while (true) {
            choice = in.nextInt();
            if (choice < 0 || choice > 5) {
                System.out.println("Επιλέξατε μη έγκυρο αριθμό. Παρακαλώ δώστε έναν αριθμό από το 1 έως το 5.");
            }
            else if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή.");
            }
            else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή.");
            }
            else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση.");
            }
            else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση.");
            }
            else {
                System.out.println("Επιλέξατε Έξοδος.");
                break;
            }
        }
    }
}
