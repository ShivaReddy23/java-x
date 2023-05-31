import java.util.Scanner;
public class RE3 {
	   public static void main(String[] args) {
		   
		    System.out.println(validate("shi_vani"));
			System.out.println(validate("shi_vani"));
			System.out.println(validate("shi_vani"));		
			System.out.println(validate("shi_vani"));	
	        }

	   public static String validate(String text) {
		   if (text.matches("^[a-z]+_[a-z]+$"))
	                return "Found a match!";
	       else
	                return "Not matched!";
	   }
}