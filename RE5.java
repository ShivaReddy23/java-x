import java.util.Scanner;
public class RE5 {
	   public static void main(String[] args) {
		   
		    System.out.println(validate("shkuyrt"));
			System.out.println(validate("sq"));
			System.out.println(validate("sccddbbjjjq"));
	        System.out.println(validate("Jar"));
	        System.out.println(validate("sjhut"));		
	        }

	   public static String validate(String text) {
		   if (text.matches("s.*?q$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
	   }
}
