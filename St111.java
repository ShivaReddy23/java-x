import java.util.Scanner;
public class St111 {
	  public static void main(String[] args) {
	    Scanner St111 = new Scanner(System.in);
	    System.out.println("Input a string: ");
	    String text = St111.nextLine();
	    System.out.println("Input a word to remove: ");
	    String word = St111.nextLine();
	    System.out.println("New string, after removing the said word:\n" + test(text, word));
	  }

	  public static String test(String text, String word) {
	    return text.replace(word, "").replace("  ", " ");
	  }
}
