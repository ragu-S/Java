package algorithms.unions.quickFind;
import java.util.ArrayList;

/**
 * Created by Raguraam on 2014-07-17.
 */
public class SimpleOut
{
    private int[] _id;
    private int _idLen;
    private int _root;

    public SimpleOut(int[] array)
    {
        this._id = array;
        this._idLen = this._id.length;
    }
    public boolean findRoot(int[] id)
    {
        int maxIndex = this._id.length;
        ArrayList roots = new ArrayList();
        int x;
        boolean isRoot;

        for(int i = 0; i < maxIndex; i++) {
            x = i;
            isRoot = false;
            while(!isRoot && x < maxIndex)
            {
                if ((this._id[x] < maxIndex) && (this._id[x] > -1))
                {
                    if (this._id[x] != x )
                    {
                        x = this._id[x];
                    }
                    else if (this._id[x] == x && x != i)
                    {
                        isRoot = true;
                        System.out.println("Index " + i + " is root of  " + x);
                    }
                    else
                    {
                        System.out.println("Index " + i + " has no other root");
                        isRoot = true;
                    }
                } else
                {
                    System.out.println(x + " is not within index of " + i);
                    isRoot = true;
                }
            }
        }
        System.out.println("*****************************************************");
        return false;
    }

    public int rootFinder(int[] index)
    {
        if(index[0] < this._id.length && this._id[index[0]] != index[0])
        {
            // set index to parent
            index[0]= this._id[index[0]];
            // recheck array: recurse
            rootFinder(index);
        }

        return index[0];
    }

    public int getRoot(int index) {
        if(index < this._idLen && index != this._id[index])
        {
            index = this.getRoot(index = this._id[index]);
        }
        return index;
    }

    public void displayRoots()
    {
        for(int i = 0; i < this._idLen; i++)
        {
            // need to pass by reference thus using 1 element array
            int[] m = {i};
            System.out.println("Index " + i + " is root of " + this.rootFinder(m));
        }

        System.out.println("*****************************************************");
    }

    public int sum(int[] arr, int n)
    {
        int result = 0;
        if(n != 0)
        {
            result = sum(arr, n-1);
            result += arr[n-1];
        }
        System.out.println("Result" + result);
        return result;
    }

    public void displayRootsShort()
    {
        for(int i = 0; i < this._idLen; i++)
        {
            // need to pass by reference thus using 1 element array
            //int[] m = {i};
            //System.out.println("Index " + i + " is root of " + this.rootFinder(m));
            System.out.println("Index " + i + " is root of " + this.root(i));
        }
        System.out.println("*****************************************************");
    }

    public void displayRecursive(int index)
    {
        if(index < this._idLen)
        {
            System.out.println("Index " + index + " is root of " + this.getRoot(index));
            displayRecursive(++index);
        }
    }

    public void union(int[] joins)
    {
        String error = "Successful join";
        if(joins.length > 1) {
            if(joins[0] < this._idLen && joins[1] < this._idLen)
            {
                this._id[joins[0]] = this._id[joins[1]];
            }
            else
            {
                error = "Error: indices greater than array length";
            }
        }
        else
        {
            error = "Need minimum two values for union";
        }

        System.out.print(error);
    }

    public int root(int i)
    {
        return _id[i] == i ? i : root(_id[i]);
    }
}
