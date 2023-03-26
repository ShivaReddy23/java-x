import java.util.Scanner;
public class D7 {
	public static void main(String[] Strings) {
	Scanner input=new Scanner(System.in);
	System.out.print("Input distance in meters: ");
	double meters=input.nextInt();
	System.out.print("Input hour: ");
	double hours=input.nextInt();
	System.out.print("Input minutes: ");
	double minutes=input.nextInt();
	System.out.print("Input seconds: ");
	double seconds=input.nextInt();
	double result=(hours*3600)+(minutes*60)+seconds;
	System.out.println("Your speed in meters/second is "+(meters/result));
	System.out.println("Your speed in km/h is "+(meters*3600)/(result*1000));
	System.out.println("Your speed in miles/h is "+(meters/result)*(3600/1000)*(1/1.069));
	}
	}

