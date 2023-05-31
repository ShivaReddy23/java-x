import java.util.Scanner;
public class RE2 {
	   public static void main(String[] args) {
		   
		    System.out.println(validate("s"));
			System.out.println(validate("sh"));
			System.out.println(validate("shh"));		
			System.out.println(validate("shi"));
			System.out.println(validate("sii"));
	        }

	   public static String validate(String text) {
		   if (text.matches("sh*?"))
	                return "Found a match!";
	        else
	                return "Not matched!";
	   }
}
