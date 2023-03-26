import java.util.Scanner;
public class D6 {
	public static void main(String[] Strings) {

	System.out.print("please enter your weight (Ib): ");
	double pound_weight = new Scanner(System.in).nextDouble();
	System.out.print("please enter your height (inches): ");
	double inches_height = new Scanner(System.in).nextDouble();
	double BMI = pound_weight/2.204623/((inches_height/39.37008)*(inches_height/39.37008));
	System.out.print("your body mass is "+BMI);
	}

	}