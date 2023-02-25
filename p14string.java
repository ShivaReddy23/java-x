import java.util.*;
	import java.io.*;
public class p14string {
	    static String leftrotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            return ans;
	    }
	    static String rightrotate(String str, int d)
	    {
	            return leftrotate(str, str.length() - d);
	    }
	    public static void main(String args[])
	    {
	            String str1 = "abcdef";
	            System.out.println(leftrotate(str1, 2));
	       
	    }
	}