import java.io.*;
public class p235lin {
	    static boolean checkOrtho(int x1, int y1, int x2, int y2,
	                    int x3, int y3, int x4, int y4)
	    {
	 
	        int m1, m2;
	        if (x2 - x1 == 0 && x4 - x3 == 0)
	            return false;
	        else if (x2 - x1 == 0)
	        {
	            m2 = (y4 - y3) / (x4 - x3);
	            if (m2 == 0)
	                return true;
	            else
	                return false;
	        }
	        else if (x4 - x3 == 0)
	        {
	             m1 = (y2 - y1) / (x2 - x1);
	            if (m1 == 0)
	                return true;
	            else
	                return false;
	        }
	 
	        else
	        {
	            m1 = (y2 - y1) / (x2 - x1);
	            m2 = (y4 - y3) / (x4 - x3);
	            if (m1 * m2 == -1)
	                return true;
	            else
	                return false;
	        }
	    }
	    public static void main (String[] args)
	    {
	        int x1 = 0, y1 = 4, x2 = 0, y2 = -9;
	        int x3 = 2, y3 = 2, x4 = -1, y4 = 0;
	 
	        if(checkOrtho(x1, y1, x2, y2, x3, y3, x4, y4)==true)
	            System.out.println ("Yes");
	        else
	            System.out.println("No" );
	    }
	}
	 

