import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.out.println("Enter three numbers - ");

			// Accepting and finding sum of numbers.

			int sum = 0;

			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 3; i++)

			sum += sc.nextInt( );

			// Printing sum and average.

			System.out.println("Sum - " + sum);

			System.out.println("Average - " + (sum / 3f));

			}

			}