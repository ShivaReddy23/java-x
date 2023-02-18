import java.util.Scanner;
public class Binary {
	

	public static void main(String[] args)
	{
	long b1,b2;
	int i=0,carryno=0;
	Scanner sc=new Scanner(System.in);
	int[] sum=new int[10];
	System.out.print("enter 1st binary no: ");
	b1=sc.nextLong();
	System.out.print("enter 1st binary no: ");
	b2=sc.nextLong();
	sc.close();
	while(b1!=0 || b2!=0)
	{
	sum[i++]=(int)((b1%10 +b2 % 10+carryno)%2);
	carryno=(int)((b1%10+b2%10+carryno)/2);
	b1=b1/10;
	b2=b2/10;
	}
	if(carryno!=0)
	{
	sum[i++]=carryno;
	}
	--i;
	System.out.print("output: ");
	while(i>=0)
	{
	System.out.print(sum[i--]);
	}
	System.out.print("\n");
	}
	}


