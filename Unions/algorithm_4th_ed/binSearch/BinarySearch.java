package algorithm_4th_ed.binSearch;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
	
	public class BinarySearch {
	    /**
	     * This class should not be instantiated.
	     */
	    private BinarySearch() { }
	
	    /**
	     * Searches for the integer key in the sorted array a[].
	     * @param key the search key
	     * @param a the array of integers, must be sorted in ascending order
	     * @return index of key in array a[] if present; -1 if not present
	     */
	    public static int rank(int key, int[] a) {
	        int lo = 0;
	        int hi = a.length - 1;
	        while (lo <= hi) {
	            // Key is in a[lo..hi] or not present.
	            int mid = lo + (hi - lo) / 2;
	            if      (key < a[mid]) hi = mid - 1;
	            else if (key > a[mid]) lo = mid + 1;
	            else return mid;
	        }
	        return -1;
	    }
	
	    /**
	     * Reads in a sequence of integers from the whitelist file, specified as
	     * a command-line argument. Reads in integers from standard input and
	     * prints to standard output those integers that do *not* appear in the file.
	     */
	    public static void main(String[] args) {
	        // read the integers from a file
	        //In in = new In(args[0]);
	        //int[] whitelist = in.readAllInts();
	
	        // sort the array
	        //Arrays.sort(whitelist);
	
	        // read integer key from standard input; print if not in whitelist
//	        while (!StdIn.isEmpty()) {
//	            int key = StdIn.readInt();
//	            if (rank(key, whitelist) == -1)
//	                StdOut.println(key);
//	        }
	    	// int bytesAvailable -> this will not be visisble inside the FOR loop below
	    	String fileName1 = "C:"+File.separator+"Users"+File.separator+"Raguraam"+File.separator+"workspace"+File.separator+"Algorithms"+File.separator+"Unions"+File.separator+"algorithm_4th_ed"+File.separator+"binSearch"+File.separator+"tinyT.txt";
	    	byte[] content = new byte[0];
	    	
	    	try {
	    		FileInputStream simpleInStream = new FileInputStream(fileName1);
	    		
	    		int bytesAvailable = simpleInStream.available();
	    		
	    		content = new byte[bytesAvailable];
	    		simpleInStream.read(content);
	    		
	    		simpleInStream.close();
	    		
	    		
	    	} catch(FileNotFoundException fnfe) {
	    		System.out.println("Could not find " + fileName1);
	    	} catch(IOException ioe) {
	    		System.out.println("Could not read from " + fileName1);
	    	}
	    	//int bytesAvailable = simpleInStream.available();
	    	for(int i = 0; i < bytesAvailable; i++) //  will not read the int variable bytesAvailable
	    		System.out.print(content[i]);
	    	//System.out.print(new String(content));
	    	//String fileName2 = "tinyW.txt";
	    	
	    	//File myFile = new File(fileName1);
	    }
	}
