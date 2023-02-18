import java.util.*;
public class p91 {
	public static void main(String args[])
	{
	long start,end,result;
	int a,b,sum;
	Scanner s = new Scanner(System.in);

	System.out.println("Measuring execution time start");
	start=System.nanoTime();
	System.out.println("Enter first number");
	a = s.nextInt();

	System.out.println("Enter second number");
	b =  s.nextInt();
	sum= a+b;
	System.out.println("sum is :"+sum);
	end = System.nanoTime();
	System.out.println("Measuring execution time stop");

	result= end-start;
	System.out.println("Hence execution time in nanosecond for sum of two numbers is :"+result);
	}
	}

