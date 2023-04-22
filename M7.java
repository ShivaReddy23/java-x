import java.util.*;
public class M7 {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int number=sc.nextInt();
	int result=0;
	for(int i=1;i<=number;i++)
	{
	result=i*(i-1)/2 + i*i;
	System.out.print(result+ " ");
	}
	}
}
