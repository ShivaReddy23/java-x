import java.util.Scanner;
public class Cs12 {
	public static void main(String[] args){

		int i, number;
		double avg, sum= 0.0;

		System.out.println("Input the 5 numbers:");

		for (i= 0; i <5; i++)
		{
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		sum +=number;
		}
		avg = sum/5;

		System.out.println("The sum of 5 numbers is :"+ sum);
		System.out.println("The Average is :"+ avg);

	}}