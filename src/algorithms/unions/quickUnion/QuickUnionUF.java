package algorithms.unions.quickUnion;
//import java.*;

/**
 * Created by Raguraam on 2014-08-08.
 * Source from coursera Princton Alogrithms part 1
 */
public class QuickUnionUF
{
    private int[] id;
    private int[] sz;

    // Instantiate Quick Union class with an array
    public QuickUnionUF(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    // Set current id array to external array
    public void setIdArray(int[] arr)
    {
        id = arr;
    }

    // None recursive root finder
    public int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    // Recursively find root
    public int rootRec(int i)
    {
        if(i != id[i]) i = rootRec(id[i]);
        return i ;
    }

    // Find method to determine if two trees are connected
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    // Standard union-find, O(N) efficient
    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public void unionAll() {
        for(int i = 0, max = id.length; i < max; i++)
        {
            pcRoot(i);
        }
    }

    // Weighted quick-union
    public void weightedUnion(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        if(i == j) return;
        if(sz[i] < sz[j])
        {
            id[i] = j;
            sz[j] += sz[i];
        }
        else
        {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public int pcRoot(int i) {
        if(id[i] != i) {
            id[i] = id[id[i]];
            i = pcRoot(id[i]);
        }
        //id[i] = i;
        return i;
    }

    public void displayArray() {
        String m = "";

        for(int i = 0, max = id.length; i < max; i++)
        {
            m += id[i] + " ";
        }

        System.out.println(m);
    }
}
