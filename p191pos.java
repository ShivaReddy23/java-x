import java.io.*;
	import java.util.*;
public class p91pos {
	    public static void check(int p, int q)
	    {
	        int max = Math.max(p, q);
	        int min = Math.min(p, q);
	        while (true) {
	            if (max == min) {
	                System.out.println("true");
	                break;
	            }
	            if (max % min != 0) {
	                System.out.println("false");
	                break;
	            }
	            int temp = max / min;
	            max = Math.max(temp, min);
	            min = Math.min(temp, min);
	        }
	    }
	    public static void main(String[] args)
	    {
	        int P = 25;
	       
	        check(P,P);
	    }
	}

