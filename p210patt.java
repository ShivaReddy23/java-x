import java.util.Scanner;
public class p210patt {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= input.nextLine();
		System.out.print("Enter a pattern: ");
		String pat= input.nextLine();
		input.close();
		if(str.length()==pat.length()) {
		System.out.println("Yes");
		} else {
		System.out.println("No");
		}
		}
		}