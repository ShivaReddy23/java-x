
public class St63 {
	 public static void main(String[] args) throws Exception {
	        String str = "educated";
	        System.out.println("The given strings is: " + str);
	        System.out.println("The first two characters appear in the last is: "
	                           + str.substring(0, 2).equals(str.substring(str.length()-2)));
	    }
}
