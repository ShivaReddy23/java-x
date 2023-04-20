import java.util.stream.IntStream;
public class St108 {
	   public static void main(String[] args) {	   
		    String text = "Follow";
			System.out.println("Original word: "+text);
			System.out.println("If there are two consecutive identical letters in the said string: "+ test(text));
			text = "Java";
			System.out.println("Original word: "+text);
			System.out.println("If there are two consecutive identical letters in the said string: "+ test(text));
			text = "Yellow";
			System.out.println("Original word: "+text);
			System.out.println("If there are two consecutive identical letters in the said string: "+ test(text));
	        }

	   public static boolean test(String text) {
			return IntStream.range(0, text.length()-1)
				.anyMatch(n -> text.charAt(n) == text.charAt(n+1));
	  	}
}
