import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int num1,num2,Sum;
		Scanner Sc=new Scanner (System.in);

		System.out.println("Enter first number:");
		num1=Sc.nextInt();
		System.out.println("Enter Second number:");
		num2=Sc.nextInt();
		Sc.close();
		Sum=num1+num2;
		System.out.println("Sum of these numbers:"+Sum);
	

	}

}
