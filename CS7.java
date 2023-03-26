import java.util.Scanner;
public class CS7 {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int month;
	int year;
	System.out.println(" MONTH");
	month = in.nextInt();
	System.out.println(" YEAR");
	year = in.nextInt();

	if(month == 2){
	if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
	System.out.print("29");
	} else
	System.out.println("28");
	} else {
	System.out.println(28 + (month + Math.floor(month / 8)) % 2 + 2 % month + 2 * Math.floor(1 / month));
	}
	}
	}
