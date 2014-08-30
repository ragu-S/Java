package algorithms.unions.Factor;

/**
 * Created by Ragu S. on 8/29/2014.
 */


public class Factorization
{
    public static void printArray(int[] arr)
    {
        for(int i = 0, len = arr.length; i < len; i++)
        {
            if(i == len-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
    }
    public static int[] findFactors(int fac)
    {
        int term = fac;
        int[] factors = {};

        while(fac > 0) {
            if(term%fac == 0)
            {
                int[] temp = factors;
                int len = temp.length;
                factors = new int[len+1];
                for(int i = 0; i < len; i++)
                {
                    factors[i] = temp[i];
                }
                factors[len] = fac;
            }
            fac--;
        }
        return factors;
    }
    public static void factorize(int numerator, int denominator)
    {
            int gcd = denominator == 0 ? -1 : numerator%denominator;

            if(gcd == -1)
            {
                System.out.println("Can not divide by zero");
            }
            else if(numerator%denominator == 0)
            {
                System.out.println(numerator / denominator + " / " + denominator / denominator + " or just " + numerator / denominator);
            }
            else if(denominator%gcd == 0 && numerator%gcd == 0)
            {
                System.out.println(numerator/gcd + " / " +  denominator/gcd);
            }
            else
            {
                System.out.println(numerator + " / " +  denominator);
            }
    }
    public static void main(String[] args)
    {
        int[] factors = findFactors(18);

        //printArray(factors);
        factorize(-4,-16);
    }
}
