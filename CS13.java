import java.util.*;
public class CS13 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number : ");
	int no=sc.nextInt();
	double cube=0;
	for (int i=1;i<=no;i++)
	{
	cube=Math.pow(i,3);
	System.out.println("cube of"+i+" is "+cube);
	}
	}
	}

