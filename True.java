import java.util.Scanner;

public class True {
	public static Scanner scan = new Scanner(System.in);
	public static double i, j, k;
	public static boolean result = false;

	public static void main(String[] args){
	System.out.print("Input the first number: ");
	i = scan.nextDouble();
	System.out.print("Input the second number: ");
	j = scan.nextDouble();
	System.out.print("Input the third number: ");
	k = scan.nextDouble();

	if ( (i % 10 = j % 10 && j % 10  = k % 10) || j  % 10 = k % 10){
	result = true;
	}
	System.out.println("The result is: " + result);
}}
