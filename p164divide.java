import java.util.Scanner;
public class p64divide {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Input the dividend: ");
	        int dividend = input.nextInt();

	        System.out.print("Input the divider: ");
	        int divider = input.nextInt();

	        if (divider == 0) {
	            System.out.println("Result: 0");
	        } else {
	            double result = 0;
	            while (true) {
	                dividend -= divider;
	                result += 1;

	                if (dividend == 0)
	                    break;
	                else if (dividend > 0 && dividend < divider) {
	                    result += (dividend)/ (double) divider;
	                    break;
	                }
	            }
	            System.out.println("Result: "+result);
	        }
	    }
	}
