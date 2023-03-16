import java.util.Scanner;
public class p212sum {
	public static void main(String[] args) {
	Scanner inp= new Scanner(System.in);
	System.out.print("Input the first number: ");
	int x= inp.nextInt();
	System.out.print("Input the second number: ");
	int y= inp.nextInt();
	int sum=x+y;
	String str= Integer.toString(sum);
	String[] arr= str.split("");
	System.out.println("Digit number of sum of said two integers: "+arr.length);
	}
	}

