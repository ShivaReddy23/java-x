import java.io.*;
public class p83one {
	
	    static int digSum(int n)
	    {
	        if (n == 0)
	        return 0;
	        return (n % 9 == 0) ? 9 : (n % 9);
	    }
	     
	    // Driver program to test the above function
	    public static void main (String[] args)
	    {
	        int n = 25;
	        System.out.println(digSum(n));
	    }
	}
