import java.util.Scanner;
public class CS30 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Input first number: ");
	int a=input.nextInt();
	System.out.print("Input second number: ");
	int b=input.nextInt();
	System.out.print("Input the third number: ");
	int c=input.nextInt();
	if(a==b&&a==c) System.out.println("All numbers are equal");
	if(a!=b&&a!=c&&b!=c) System.out.println("All numbers are different");
	if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a)) System.out.println("Neither all are equal or different");
	}
}
