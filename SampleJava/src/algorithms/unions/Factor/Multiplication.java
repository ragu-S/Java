package algorithms.unions.Factor;

/**
 * Created by Ragu S. on 8/29/2014.
 */
public class Multiplication
{
    public static int fibonacci(int N, boolean zeroBased)
    {
        int fib = 0;
        // handles zero based fibonacci sequence
        if(zeroBased) {
            switch (N) {
                case 0:
                    return 0;
                case 1:
                    return 0;
                case 2:
                    return 1;
            }
        }
        else if(N <= 1) {
            return 1;
        }

        fib = fibonacci(N - 1, zeroBased) + fibonacci(N - 2, zeroBased);

        return fib;
    }
    public static int printTime()
    {
        return (int)(System.currentTimeMillis());
    }
    public static void main(String[] args)
    {
        int num1, num2;
        num1 = printTime();
        System.out.println(fibonacci(8, true));
        num2 = printTime();

        System.out.println(num2-num1);
    }
}
