	import java.util.Scanner;
	public class MultiplyBinary
	{
	public void Multiply(String b1,String b2)
	{
	int n1=Integer.parseInt(b1,2);
	int n2=Integer.parseInt(b2,2);
	int product=n1*n2;
	System.out.println(Integer.toBinaryString(product));
	}
	public static void main(String[] args)
	{
	MultiplyBinary multiplyBinary=new MultiplyBinary();
	Scanner sc=new Scanner(System.in);
	System.out.print("enter 1 st binary no: ");
	String b1=sc.nextLine();
	System.out.print("enter 2 nd binary no: ");
	String b2=sc.nextLine();
	System.out.print("product of 2 nos: ");
	multiplyBinary.Multiply(b1,b2);
	}
	
}
