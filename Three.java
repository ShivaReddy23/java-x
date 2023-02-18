import java.util.Scanner;

public class Three {
	public static void main(String []args) {
		int a,b,c,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=s.nextInt();
		System.out.println("Enter the second number");
		b=s.nextInt();
		System.out.println("Enter the third number");
		c=s.nextInt();
		if(a+b==c) {
			sum=a+b;
			System.out.println("Sum is="+sum);
			System.out.println("True");
		}
		else if(b+c==a) {
			sum=b+c;
			System.out.println("Sum is="+sum);
			System.out.println("True");
		}
		else 
			System.out.println("False");
		}
		
	}