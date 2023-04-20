n
public class St96 {
	 public static void main(String[] args) throws Exception {
	        String str = "zebrazone";
	        System.out.println("The given string is: " + str);

	       String s = "";
	        for (int i = 0; i < str.length(); i++){
	            if (i > 0 && i < str.length()-1 && str.charAt(i) == 'z')
	                continue;
	            s += str.charAt(i);
	        }
	        System.out.println("The new string is: " + s);
	    }
}
