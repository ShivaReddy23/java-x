import java.util.Scanner;
public class p220over {
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Input the first number: ");
	int a= input.nextInt();
	System.out.println("Input the second number: ");
	int b= input.nextInt();
	int sum= a+b;
	String str= String.valueOf(sum);
	if(sum>=0&&str.length()<80)
	System.out.println("Sum of the said two integers: "+sum);
	}
	}
