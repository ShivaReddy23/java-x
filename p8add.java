import java.util.*;
public class p8add {  
	 
	static int digSum(int n)  
	{  
	if (n == 0)  

	return 0;  
	return (n % 9 == 0) ? 9 : (n % 9);  
	}     
 
	public static void main (String args[])  
	{  
	int n = 25; 
	System.out.println("The sum of digits is: "+digSum(n));  
	}  
	}  