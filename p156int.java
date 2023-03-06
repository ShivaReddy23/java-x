import java.io.*;
	import java.lang.*;
public class Np6int {
	
	 
	    public static int log2(int N)
	    {
	        int result = (int)(Math.log(N) / Math.log(2));
	 
	        return result;
	    }
	    public static void main(String[] args)
	    {
	 
	        int N = 2350;
	 
	        System.out.println("Log " + N + " to the base 2 = " + log2(N));
	    }
}
