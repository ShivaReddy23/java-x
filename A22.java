import java.util.Scanner;
public class A22 {
	public static void main(String[] args) {
		Scanner vi = new Scanner(System.in);
		System.out.println("Enter Any number");
		int number = vi.nextInt();
		System.out.println("print pairs value of sum");
		int[] arr = { 2, 7, 4, -5, 11, 5, 20, 14, -15, 9, 16, 25, 45, 12, 8 };

		for (int i = 0; i < arr.length; i++) {
		for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] + arr[j] == number) {
		System.out.println(arr[i] + "+" + arr[j] + "=" + number);
		}
		}
		}
		}
}
