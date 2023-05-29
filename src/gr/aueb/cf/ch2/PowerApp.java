package gr.aueb.cf.ch2;

import gr.aueb.cf.ch5.AddApp;
import gr.aueb.cf.ch5.FactorialApp;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int a;
        int result;
        int result2;
        int result3;
        System.out.println("Please insert a number n (int)");
        n=in.nextInt();
        System.out.println("Please insert the power of n (int)");
        a=in.nextInt();
        result= FactorialApp.Facto(n);
        result2= AddApp.add(n,n);
        result3=PowerApp.Power(n,a);
        System.out.println("The Factorial of n is:"+result);
        System.out.println("The Add of n is:"+result2);
        System.out.println("The Power of n is:"+result3);

    }
    public static int Power(int a, int n ){
        int power=1;

        for (int i=1; i<=n;i++){
            power=power*a;
        }
        return power;
    }
}
