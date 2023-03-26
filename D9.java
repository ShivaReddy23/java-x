import java.util.Scanner;
public class D9 {
	public static void main(String[] Strings) {
	Scanner input=new Scanner(System.in);
	System.out.print("Input 1st integer: ");
	int a= input.nextInt();
	System.out.print("Input 2nd integer: ");
	int b= input.nextInt();
	System.out.println("Sum of two integers: "+(a+b));
	System.out.println("Difference of two integers: "+(a-b));
	System.out.println("Product of two integers: "+(a*b));
	System.out.println("Average of two integers: "+(a+b)/2);
	System.out.println("Distance of two integers: "+Math.abs(a-b));
	System.out.println("Max integer: "+Math.max(a, b));
	System.out.println("Min integer: "+Math.min(a, b));
	}
	}

