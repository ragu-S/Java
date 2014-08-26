package algorithms.unions.quickUnion;

/**
 * Created by Raguraam on 2014-08-21.
 */
public class customMath
{
    public static int abs(int x)
    {
        if(x < 0) return -x;
        else      return x;
    }

    public static double abs(double x)
    {
        if(x < 0.0) return -x;
        else        return x;
    }

    /**
     * Checks whether given int is a Prime
     * @param N
     * @return true if prime, false if otherwise
     */
    public static boolean isPrime(int N)
    {
        if(N < 2) return false;
        for(int i = 2; i*i <= N; i++)
            if(N % i == 0) return false;
        return true;
    }

    /**
     * Performs square root calculation using Newton's method
     * @param c
     * @return double if c is non-zero, else return NaN
     */
    public static double sqrt(double c)
    {
        if(c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while(Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }

    /**
     * Determines hypotenuse of a right triangle using Newton's square root method
     * @param a
     * @param b
     * @return double
     */
    public static double hytpotenuse(double a, double b)
    {
        return sqrt(a*a + b*b);
    }

    /**
     * Determines the harmonic number for a given N
     * @param N
     * @return double
     */
    public static double H(int N)
    {
        double sum = 0.0;

        for(int i = 1; i <= N; i++)
            sum += 1.0 / i;

        return sum;
    }

    public static <T> T checkArr(T set)
    {
        ;
    }
}
