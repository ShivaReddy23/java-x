import java.util.Scanner;
public class CS29 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Input an integer number less than ten billion: ");
	long x=input.nextLong();
	String str=String.valueOf(x);
	if(str.length()<=10)
	System.out.println("Number of digits in the number: "+str.length());
	else System.out.println("The number is bigger than ten billions");
	}
	}

