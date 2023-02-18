import java.util.Scanner;
public class Integer {
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		int n, m;
 
		System.out.print("Input number: ");
		n = ip.nextInt();
		int n1 = n * 1;
		int n2 = n * 11;
		int n3 = n * 111;
		 
		System.out.printf("%d + %d + %d", n1, n2, n3); // Prints 10 + 110 + 1110 = 1230
		 
		m = n1 + n2 + n3;
	
	}
	

}