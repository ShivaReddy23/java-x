public class RE19 {
	 public static void main(String[] args) {	   
		    String text = "hi hello .";
			System.out.println("Original Text: "+text);
			System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));
			text = "Java Exercises.";
			System.out.println("\nOriginal Text: "+text);
			System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));
			text = "Java linkedlist.";
			System.out.println("\nOriginal Text: "+text);
			System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));
		    
	        }

	   public static String validate(String text) {
		     	String s = text.replaceAll("(?i)[pqr]", "");
	    return text.equals(s) ? "Not found." : s;
	   }
}
