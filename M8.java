import java.util.Locale;
	import java.util.Scanner;
public class M8 {
	    public static void main(String[] args) throws Exception {
	        Scanner input = new Scanner(System.in).useLocale(Locale.US);
	        System.out.print("Input the investment amount: ");
	        double inv = input.nextDouble();

	        System.out.print("Input the rate of interest: ");
	        double interest = input.nextDouble() / (double) 1200;

	        System.out.print("Input number of years: ");
	        double year = input.nextDouble();

	        FV(inv, interest, year);
	        }

	    public static void FV(double investmentAmount, double interestRate, double numOfYears) {
	        System.out.println("Years        FutureValue");
	        for (int i = 1; i <= numOfYears; i++){
	            double fv = investmentAmount * Math.pow((1 + interestRate), (i*12));
	            System.out.printf("-%5d        %-4.2f", i, fv);
	            System.out.println();
	        }
	    }
}
