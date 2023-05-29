package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class AddBigIntApp {
    public static void main(String[] args) {

        BigInteger BigNum1= new BigInteger("2147483647");
        BigInteger BigNum2= new BigInteger("2147483665");
        BigInteger result= new BigInteger("0");

        result= BigNum1.add(BigNum2);

        System.out.printf("%d",result);

    }
}
