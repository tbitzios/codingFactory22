package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το α^n
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {

    }

    /**
     * Recursive a^n
     *
     * @param a the base
     * @param b the power
     * @return the power of base
     */
    public static float power(float a, float b) {
        if (b == 0) {
            return 1;
        }
        else if (b < 0) {
            return 1 / power(a, -b);
        }else {
            return a*power(a, b - 1);
        }
    }
}