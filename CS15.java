import java.util.Scanner;
public class CS15 {
	public static void main(String[] strings) {
	Scanner in = new Scanner(System.in);
	System.out.print("please enter a numbers:");
	int number = in.nextInt();
	int sum =0;
	for (int i = 1; i <= (number*2)-1; i++) {
	if ((i%2)!=0){
	System.out.println(i);
	sum +=i;
	}
	}
	System.out.println("the sum of the odd number is: "+sum);
	}
	}

