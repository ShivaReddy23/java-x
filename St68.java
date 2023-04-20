
public class St68 {
	 public static void main(String[] args) throws Exception {
	        String str1 = "test#string";
	        System.out.println("The given strings is: " + str1);
	        System.out.println("The new string is: " + newStr(str1));

	        String str2 = "test##string";
	        System.out.println("\nThe given strings is: " + str2);
	        System.out.println("The new string is: " + newStr(str2));

	        String str3 = "test#the#string";
	        System.out.println("\nThe given strings is: " + str3);
	        System.out.println("The new string is: " + newStr(str3));

	    }
	    public static String newStr(String s){
	        String sr = "";
	        for (int i = 0; i < s.length(); i++){
	            if (i != s.length()-1)
	                if (s.charAt(i+1) == '#') continue;
	            if (i != 0)
	                if (s.charAt(i-1) == '#') continue;
	            if (s.charAt(i) == '#') continue;
	            sr += s.charAt(i);
	        }
	        return sr;
	    }
}
