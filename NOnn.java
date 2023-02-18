import java.util.Scanner;
public class NOnn {
	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);

		System.out.print("Input a first number: ");
		int a = input.nextInt();
		int a1 = a%10;

		System.out.print("Input a second number: ");
		int b = input.nextInt();
		int b1 = b%10;

		System.out.print("Input a third number: ");
		int c = input.nextInt();
		int c1 = c%10;

		boolean test = (a1==b1) || (a1==c1) || (b1==c1);

		System.out.print("The last digit of at least two numbers are the same: " + test);
		}
}
