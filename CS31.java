import java.util.Locale;
	import java.util.Scanner;
public class CS31 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in).useLocale(Locale.US);

	        System.out.print("Input first number: ");
	        int num1 = input.nextInt();

	        System.out.print("Input second number: ");
	        int num2 = input.nextInt();

	        System.out.print("Input third number: ");
	        int num3 = input.nextInt();

	        if (num1 < num2 && num2 < num3)
	            System.out.println("Increasing order");
	        else if (num1 > num2 && num2 > num3)
	            System.out.println("Decreasing order");
	        else
	            System.out.println("Neither increasing or decreasing order");
	    }
	}