import java.util.Scanner;
public class CS2 {
	public static void main(String[] strings) {

		Scanner input= new Scanner(System.in);
		System.out.print("Input a: ");
		double a = input.nextDouble();
		System.out.print("Input b: ");
		double b = input.nextDouble();
		System.out.print("Input c: ");
		double c = input.nextDouble();
		double bac= Math.pow(((Math.pow(b,2))-(4.0*a*c)),0.5);

		if (bac>0.0){
		double rot1 = (-b + bac) /(2.0*a);
		double rot2 = (-b - bac) /(2.0*a);
		System.out.println("the roots are "+ rot1 +" and "+rot2 );

		}
		else if (bac==0){
		double rot1 = -b /(2.0*a);
		System.out.println("the root is" +rot1 );
		}
		else {
		System.out.println("The equation has no real roots");
		}
	}}
