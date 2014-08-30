package algorithms.unions.quickFind;

/**
 * Created by Raguraam on 2014-08-07.
 */
public class main {
    public static void main(String[] args)
    {
        int[] id = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] id2 = { 3, 2, 1, 3, 4 };
        int[] id3 = {0, 9, 6, 5, 4, 2, 6, 1, 0, 5};
        //findRoot(numArray);
        //x.findRoot(id3); // normal object call
        //simpleOut.findRoot(id2); // static call
        SimpleOut x = new SimpleOut(id2);

        //for(int i = 0; i < id3.length; i++)
        //id3.root()
        x.displayRoots();
        //x.displayRootsShort();
        //x.displayRecursive(0);
        //System.out.println("Sum is " + x.sum(id, id.length));
    }
}
