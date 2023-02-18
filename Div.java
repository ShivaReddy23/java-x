import java.util.Scanner;
public class Div {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("input first number :");
		int a=s.nextInt();
		System.out.print("input second number : ");
		int b=s.nextInt();
		System.out.print("input third number : ");
		int c=s.nextInt();
		if(a>=20 || b>=20 || c>=20)
		{

		if((a-b)>=20 || (b-c)>=20 || (c-a)>=20) {
		System.out.println("true");
		}
		else
		System.out.println("false");
		}
		else
		System.out.println("fasle");

		}
		}

