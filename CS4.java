import java.util.Scanner;
public class CS4 {
	public static void main(String[] Strings) {
	Scanner input= new Scanner(System.in);
	System.out.print("Input a numbers: ");
	float x= input.nextInt();
	if(x==0) System.out.println("Zero");
	if(Math.abs(x)<1) System.out.println("Small");
	if(x>1000000) System.out.println("Large");
	else System.out.println((x>=0)? "Positive number": "Negative number");
	}
	}

