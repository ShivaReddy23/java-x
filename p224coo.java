import java.io.*;
public class p224coo {
	
	    static void circle(int x1, int y1, int x2, int y2,
	                       int r1, int r2)
	    {
	        double d = Math.sqrt((x1 - x2) * (x1 - x2)
	                             + (y1 - y2) * (y1 - y2));
	 
	        if (d <= r1 - r2) {
	            System.out.println("Circle B is inside A");
	        }
	        else if (d <= r2 - r1) {
	            System.out.println("Circle A is inside B");
	        }
	        else if (d < r1 + r2) {
	            System.out.println("Circle intersect"
	                               + " to each other");
	        }
	        else if (d == r1 + r2) {
	            System.out.println("Circle touch to"
	                               + " each other");
	        }
	        else {
	            System.out.println("Circle not touch"
	                               + " to each other");
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int x1 = 5, y1 = 6;
	        int x2 = 8, y2 = 9;
	        int r1 = 8, r2 = 5;
	        circle(x1, y1, x2, y2, r1, r2);
	    }
	}
	 

