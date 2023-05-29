package gr.aueb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1= 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        mod=num1%num2;


        result1= num1 + num2 ;
        result2= num1++ ; //prota ekxwrisi k meta afksisi
        result2= ++num1 ; // prota afksisi k meta ekxwrisi
        result1 +=10 ;// result1=result1+10
        result1 *=10 ;// to idio me epi

                System.out.printf("sum:%d, sub:%d, mul:%d, div:%d,mod:%d"
                        ,sum ,sub,mul,div,mod);


    }

}
