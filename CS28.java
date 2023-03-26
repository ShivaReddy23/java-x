import java.util.Scanner;
public class CS28 {
	public static void main(String[] strings) {
	Scanner input= new Scanner(System.in);
	System.out.print("Input a letter: ");
	double number = input.nextDouble();
	if (number>0){
	if (number<1){
	System.out.println("the number is small positive");
	}
	else if (number>1000000){
	System.out.println("the number is large positive");

	}
	else {
	System.out.println("the number is positive");
	}
	}
	else if (number<0){
	if (Math.abs(number)<1){
	System.out.println("the number is small negative");
	}
	else if (Math.abs(number)>1000000){
	System.out.println("the number is large negative");

	}
	else {
	System.out.println("the number is negative");
	}
	}
	else {
	System.out.println("the number is zero");
	}

	}
	
}
