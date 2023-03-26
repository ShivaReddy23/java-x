import java.util.Scanner;
public class CS11 {
	public static void main(String[] args) {

	Scanner num = new Scanner(System.in);
	System.out.print("Input natural number: ");
	int number = num.nextInt();

	int i = 1;
	int j = 0;
	System.out.println("The first " + number + " natural numbers are: ");

	while(i <= number){
	j+=i;
	System.out.println(i++);
	}
	System.out.println("The Sum of Natural Number up to " + number + " terms : " + j);

	}
	}



