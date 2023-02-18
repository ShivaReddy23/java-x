import java.util.Scanner;
public class Sub {
	public static Scanner scan = new Scanner(System.in);
	public static boolean result = false;
	public static int a,b,c;

	public static void main(String[] args){
	System.out.print("input the first number: ");
	a = scan.nextInt();
	System.out.print("input the second number: ");
	b = scan.nextInt();
	System.out.print("input the third number: ");
	c = scan.nextInt();
	if ((a - b) >= 20 || (b-c) >= 20 || (c-a) >= 20 ) {
	result = true;
	}
	System.out.println(result);
	}
	}
