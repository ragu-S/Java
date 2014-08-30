package algorithms.unions.quickUnion;

/**
 * Created by Raguraam on 2014-08-08.
 */

public class Main
{
    public static void main(String[] args)
    {
        QuickUnionUF union1 = new QuickUnionUF(10);
        QuickUnionUF union2 = new QuickUnionUF(5);

                    // 0 1 2 3 4 5 6 7 8 9
        // int[] arr = {2, 3, 4, 9, 3, 6, 7, 4, 8, 9};
        int[] arr2 = {0, 9, 6, 5, 4, 2, 6, 1, 0, 5};
        union2.setIdArray(arr2);
        //union2.displayArray();
        union2.unionAll();
        //System.out.println(union2.root(2));
        //union2.displayArray();

        System.out.println(customMath.sqrt(4));
        System.out.println(customMath.hytpotenuse(6, 8));

    }
}
