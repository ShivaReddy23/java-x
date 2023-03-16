import java.util.*;
	import java.lang.*;
public class p208str {
	static int countChar(String str, char x)
	{
	    int count = 0;
	    int n = 10;
	    for (int i = 0; i < str.length(); i++)
	        if (str.charAt(i) == x)
	            count++;
	    int repetitions = n / str.length();
	    count = count * repetitions;
	 
	    for (int i = 0;
	            i < n % str.length(); i++)
	    {
	        if (str.charAt(i) == x)
	            count++;
	    }
	 
	    return count;
	}
	public static void main(String args[])
	{
	    String str = "aaaabbbbcccccddddeeee";
	    System.out.println(countChar(str, 'a'));
	}
	}
	 

