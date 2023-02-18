import java.util.Scanner;
	//import java.lang.*;
public class p70 {
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			
			if(s1.length() >= s2.length())
				System.out.println(s2+s1+s2);
			else
				System.out.println(s1+s2+s1);
			
			
			
		}
		
	}
