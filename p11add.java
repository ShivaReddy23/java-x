import java.util.*;
public class p11add {

	    static int add(int a, int b)
	    {
	        for (int i = 1; i <= b; i++)
	            a++;
	        return a;
	    }
	 
	    public static void main(String[] args)
	    {
	        int a = add(10, 12);
	        System.out.print(a);
	    }
	}