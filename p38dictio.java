import java.io.*;
	import java.util.*;
	import java.util.Scanner;
	public class p38dictio {

	
	public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Input 4 random words: ");
	String a1=input.nextLine();
	char[] list1=a1.toCharArray();
	String a2=input.nextLine();
	char[] list2=a2.toCharArray();
	String a3=input.nextLine();
	char[] list3=a3.toCharArray();
	String a4=input.nextLine();
	char[] list4=a4.toCharArray();
	input.close();
	int a=list1.length, b=list2.length,c=list3.length,d=list4.length;
	if(a>b&&a>c&&a>d) { System.out.println("Result: "+a1);
	}if(b>a&&b>c&&b>d) { System.out.println("Result: "+a2);
	}if(c>b&&c>a&&c>d) { System.out.println("Result: "+a3);
	}if(d>b&&d>c&&d>a) { System.out.println("Result: "+a4);}
	}
	}