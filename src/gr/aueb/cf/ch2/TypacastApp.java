package gr.aueb.cf.ch2;

public class TypacastApp {
    public static void main(String[] args) {
        int num1 = 10 ;
        long num2 = 20L;//me to L metatrepetai apo 32byto se 64byto gia betistopoisi xwritikotitas
                        //den borw na kanw num1=num2 gt int<long
                        //alla borw num2=num1 diliadi long=int
        long result =0L;

        num1=(int)num2;

        result=num1+num2; //edw i metatropi megethous se long ginetai automata
    }
}
