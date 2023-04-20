
public class St82 {
	 public static void main(String[] args) throws Exception {
	        String str = "welcome";
	        System.out.println("The given string is: " + str);

	        String s = "";
	        for (int i = 0; i < str.length(); i++){
	            s += str.charAt(i);
	            s += str.charAt(i);
	        }
	        System.out.println("The new string is: " + s);
	    }
}
