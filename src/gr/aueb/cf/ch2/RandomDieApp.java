package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {

        int die= (int)(Math.random() * 6 ) + 1 ; //(max-min +1)-min

        System.out.println(die);
    }
}
