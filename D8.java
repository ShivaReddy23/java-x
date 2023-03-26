import java.util.Scanner;
public class D8 {
	public static void main(String[] Strings) {
	Scanner input=new Scanner(System.in);
	System.out.print("Input the side length value: ");
	double x= input.nextInt();
	System.out.println("Square: "+Math.pow(x, 2));
	System.out.println("Cube: "+Math.pow(x, 3));
	System.out.println("Fourth power: "+Math.pow(x, 4));
	}
	}