import java.io.IOException;
	import java.util.Scanner;
public class CS25 {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.print("Input the number: ");
	int num=scan.nextInt();
	for(int i=1; i<=num; i++)
	{
	for(int k=num; k>=i; k--)
	{
	System.out.print(" ");
	}
	for(int j=i; j>=1; j--)
	{
	System.out.print(j);
	}
	for(int l=2; l<=i; l++)
	{
	System.out.print(l);
	}
	System.out.println();
	}
	int n=1;
	for(int i=num-1; i>=1; i--)
	{
	for(int k=1; k<=n+1; k++)
	{
	System.out.print(" ");
	}
	for(int m=i; m>=1; m--)
	{
	System.out.print(m);
	}
	for(int p=2; p<=i; p++)
	{
	System.out.print(p);
	}
	System.out.println(); n++;
	}}}