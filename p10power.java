import java.io.*;
public class p10power {
	    static boolean isPowerOfFour(int n)
	    {
	        return ((n>0) && ((n & n-1) == 0) && (n%3 == 1));
	    }
	    public static void main(String[] args)
	    {
	        int test_no = 64;
	        if(isPowerOfFour(test_no) == true)
	        System.out.println(test_no +
	                        " is a power of 4");
	        else
	        System.out.println(test_no +
	                        " is not a power of 4");
	    }
	}
