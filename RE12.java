import java.util.*;
public class RE12 {
	   public static void main(String[] args) {
		   
		    String text = "Python is an interpreted high-level general-purpose programming language. " ;
			System.out.println("Original string:");
			System.out.println(text);
			System.out.println("\nAfter replacing Python to Java and code to coding in the said string:");
			System.out.println(validate(text));
	        }

	   public static String validate(String text) {
		   return text.replace("Python", "Java").replace("code", "coding");
	   }
}
