import java.util.Scanner;
public class p247whe {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Input three integers (a,b,c):");
	double a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
	boolean result=false;
	if(a+b>c)
	result=true;
	System.out.println("Check whether (a + b) is greater than c?\n"+result);
	}
	}

