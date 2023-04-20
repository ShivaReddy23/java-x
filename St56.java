
public class St56 {
	 public static void main(String[] args) throws Exception {
	        String str1 = "food";
	        String str2 = "door";
	        System.out.println("The given strings are: " + str1 +" and "+ str2);

	        if (str1.charAt(str1.length()-1) == str2.charAt(0))
	            str2 = str2.substring(1);

	        System.out.println("The string after concatination are: " + str1 + str2);
	    }
	}
