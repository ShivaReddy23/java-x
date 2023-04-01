import java.util.*;
public class A6 {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter your number: ");
	int number = console.nextInt();
	int[] a = {44, 15, 13, 11, 19, 18};
	System.out.println("Index position of " + number + " is " + indexCheck(a, number));
	}
	public static int indexCheck(int[] a, int number) {
	for(int i = 0; i < a.length; i++) {
	if(a[i] == number) {
	return i;
	}
	}
	return -1;
	}
}
