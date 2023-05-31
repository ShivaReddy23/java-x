public class RE30 {
	 public static void main(String[] args) {	   
		    String text = "Python Exercises";
			System.out.println("Original string: "+text);
			System.out.println("Insert a dash between an upper case letter and a lower case letter in the said string:\n"+validate(text));
			text = " lazy Dog.";
			System.out.println("\nOriginal string: "+text);
			System.out.println("Insert a dash between an upper case letter and a lower case letter in the said string:\n"+validate(text));	
			text = "java";
			System.out.println("\nOriginal string: "+text);
			System.out.println("Insert a dash between an upper case letter and a lower case letter in the said string:\n"+validate(text));
	        }

	   public static String validate(String text) {
		   return text.replaceAll("(?<=[A-Z])(?=[a-z])", "-");
	    }
}
