import java.util.Scanner;
import java.util.Locale;
public class CS8 {
	
	    public static void main(String[] args) {

	      Scanner input = new Scanner(System.in).useLocale(Locale.US);

	        System.out.print("Input an alphabet: ");
	        String letter = input.next().toLowerCase();

	        if (letter.length() > 1) {
	            System.out.println("Error. Not a single character.");

	        } else if (!(isThere(letter))){
	            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");

	        } else if (letter.equals("a") || letter.equals("e") ||
	                   letter.equals("i") || letter.equals("o") ||
	                   letter.equals("u")){
	            System.out.println("Input letter is Vowel");
	        } else {
	            System.out.println("Input letter is Consonant");
	        }


	    }
	    public static boolean isThere(String l){
	        if (l.charAt(0) > 96 && l.charAt(0) < 123){
	                return true;
	        }
	        return false;
	    }
	}