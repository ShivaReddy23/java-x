
public class St71 {
	 public static void main(String[] args) throws Exception {
	        String str1 = "xyz".toLowerCase(), str2 = "pqrxyz".toLowerCase();

	        System.out.println("The given strings are: "+str1+" and "+str2);
	        System.out.println("Is one string appears at the end of other? "
	                           + isAppearEnd(str1, str2));

	        System.out.println("\nThe given strings are: "+str2+" and "+str1);
	        System.out.println("Is one string appears at the end of other? "
	                           + isAppearEnd(str1, str2));

	    }
	    public static boolean isAppearEnd(String s1, String s2){
	        String s, e;
	        if (s1.length() < s2.length()) {
	            s = s1;
	            e = s2;
	        } else {
	            s = s2;
	            e = s1;
	        }
	       return e.substring(e.length() - s.length()).equals(s);
	    }
}
