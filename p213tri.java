import java.io.*;
	import java.util.*;
public class p213tri {
	static int checkPerfectSquare(int N)
	{
	    if (N <= 0)
	    {
	        return 0;
	    }
	    double sq = Math.sqrt(N);
	    if (Math.floor(sq) == Math.ceil(sq))
	    {
	        return 1;
	    }
	    return 0;
	}
	static boolean checktwoSidesareRighTriangle(int A,
	                                            int B)
	{
	    boolean checkTriangle = false;
	  
	    if (checkPerfectSquare(A * A + B * B) != 0)
	    {
	        checkTriangle = true;
	    }
	    if (checkPerfectSquare(A * A - B * B) != 0)
	    {
	        checkTriangle = true;
	    }
	    if (checkPerfectSquare(B * B - A * A) != 0)
	    {
	        checkTriangle = true;
	    }
	    return checkTriangle;
	}
	public static void main(String[] args)
	{
	    int A = 3, B = 4;
	    if (checktwoSidesareRighTriangle(A, B))
	    {
	        System.out.print("Yes");
	    }
	    else
	    {
	        System.out.print("No");
	    }
	}
	}

