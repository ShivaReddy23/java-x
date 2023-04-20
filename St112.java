import java.util.Scanner;
public class St112 {
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Input the first string: ");
	    String text = myObj.nextLine();
	    System.out.println("Input the second string: ");
	    String word = myObj.nextLine();
	    System.out.println("Check first string contains letters from the second string:\n" + test(text, word));
	  }

	  public static boolean test(String first_string, String second_string) {
	    for (int n = 0; n < second_string.length(); n++)
	      if (first_string.replaceFirst(second_string.substring(n, n + 1), "").equals(first_string))
	        return false;
	      else
	        first_string = first_string.replaceFirst(second_string.substring(n, n + 1), "");
	    return true;
	  }
	}
