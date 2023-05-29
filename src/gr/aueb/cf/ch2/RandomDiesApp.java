package gr.aueb.cf.ch2;
/*
rixnw 2 tixaia zaria
 */
public class RandomDiesApp {
    public static void main(String[] args) {
        int die1= 0;
        int die2= 0;


        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("die1: %d  die2: %d", die1, die2);
    }
}
