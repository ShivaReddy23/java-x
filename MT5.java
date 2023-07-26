import java.util.*;
public class A5 {
	public static void main(String[] args) {
	int[] a = {4, 5, 3, 1, 5, 3};
	Scanner console = new Scanner(System.in);
	System.out.print("Please enter your number: ");
	int input = console.nextInt();
	System.out.println(test(a, input));
	}
	public static boolean test (int[] a, int input) {
	for (int i = 0; i < a.length; i++) {
	if(a[i] == input) {
	return true;
	}
	}
	return false;
	}
	}

