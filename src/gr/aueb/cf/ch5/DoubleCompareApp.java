package gr.aueb.cf.ch5;

/**
 * Ελέγχει ισότητα ανισότητα στους
 * floating points.
 */
public class DoubleCompareApp {

    public static void main(String[] args) {

        double d1=8.9999;
        double d2=1.001;
        final double EPSILON=0.885;

        if(Math.abs(d2-d1)<=EPSILON) {
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }
    }
}
