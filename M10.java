import java.util.Scanner;
public class M10 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Input a year:");
	int year=input.nextInt();
	System.out.print("Is "+year+" a leap year? ");
	if(year%4==0&&(year%100!=0||(year%100==0&&year%400==0))) {
	System.out.println(true);
	}else System.out.println(false);
	}
}
