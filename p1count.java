package New;
import java.util.*;
public class p1count {
	

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Input list of numbers: ");
	String str1 = input.nextLine();

	String[] lo1 = str1.split(" ");

	int[] loNum1 = new int[lo1.length];

	for (int i = 0 ; i < lo1.length ; i++)
	loNum1[i] = Integer.parseInt(lo1[i]);

	int count10 = 0;
	int count20 = 0;
	for (int j = 0 ; j < lo1.length ; j++){
	if (loNum1[j] == 10)
	count10 += 1;
	else if (loNum1[j] == 20)
	count20 += 1;
	}
	System.out.println(count10 > count20);
	}
	}