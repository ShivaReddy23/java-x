import java.util.Scanner;
public class NP3double {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	double num1, num2;
	System.out.print("Enter two double values: ");
	num1 = input.nextDouble();
	num2 = input.nextDouble();

	if (num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1) {
	System.out.println("true");
	} else {
	System.out.println("false");
	}

	}
	}
