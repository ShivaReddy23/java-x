import java.util.Scanner;
public class RE1 {
	   public static void main(String[] args) {
		   
		    System.out.println(validate("ABCDEFabcdef123450"));
			System.out.println(validate("SQL"));		
			System.out.println(validate("Java"));
			System.out.println(validate("*&%@#!}{"));
			System.out.println(validate("shiv"));
	        }

	   public static boolean validate(String text) {
	    return text.matches("^[\\w]+$");
	  }
}
