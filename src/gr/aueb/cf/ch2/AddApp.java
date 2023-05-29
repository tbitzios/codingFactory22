package gr.aueb.cf.ch2;

public class AddApp {
    //overflowwwwww
    public static void main(String[] args) {
        // dilosi kai arxikopoisi entolwn
        int num1 = 2_147_483_647;
        int num2 = 2 ;
        int result= 0;

        // entoles
        result=num1+num2;

        //emfanisi apotelesmaton

        System.out.printf("Sum=" +result);


    }
}
