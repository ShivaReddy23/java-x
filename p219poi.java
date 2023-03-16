import java.io.*;
	import java.util.*;
public class p219poi {
	static void checkTriangle(int x1, int y1,
	                          int x2, int y2,
	                          int x3, int y3)
	{
	    int a = x1 * (y2 - y3) +
	            x2 * (y3 - y1) +
	            x3 * (y1 - y2);
	    if (a == 0)
	        System.out.println("The point is not outside the triangle.");
	    else
	        System.out.println("The point is outside the triangle.");
	}
	public static void main(String[] args)
	{
	    int x1 = 2, y1 = 6,
	        x2 = 3, y2 = 5,
	        x3 = 4, y3 = 6;
	    checkTriangle(x1, y1, x2, y2, x3, y3);
	}
	}

