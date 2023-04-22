import java.util.Scanner;
public class M18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the first number");
		int a = scanner.nextInt();
		System.out.println("Input the second number");
		int b = scanner.nextInt();
		System.out.println("Input the third number: ");
		int c = scanner.nextInt();
		System.out.println("heck whether the three said numbers are consecutive or not!");
		System.out.println(test(a,b,c));
		}
		public static boolean test(int a, int b, int c){
		return b-a == 1 && c-b ==1;
		}
}
