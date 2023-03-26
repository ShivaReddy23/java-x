import java.util.Scanner;
public class CS32 {
	public static void main(String[] strings) {

	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the first number: ");
	double num1 = input.nextDouble();
	System.out.print("Please enter the second number: ");

	// first way (int )
	double num2 = input.nextDouble();
	int num1_int = (int) (num1*100);
	int num2_int = (int) (num2*100);
	if (num1_int==num2_int){
	System.out.println("The numbers are equal.");
	}
	else {
	System.out.println("The numbers are different.");
	}
	}
	}

