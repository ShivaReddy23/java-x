public class St73 {
	  public static void main(String[] args) throws Exception {
	        String str1 = "testabc.test", str2 = "test.abctest";

	        System.out.println("The given strings is: "+str1);
	        System.out.println("Is 'abc' appear before period? "
	                           + isAppear(str1));

	        System.out.println("\nThe given strings are: "+str2);
	        System.out.println("Is 'abc' appear before period? "
	                           + isAppear(str2));

	    }
	    public static boolean isAppear(String s){
	        for (int i = 2, j = 0; i < s.length(); i++, j++){
	            if (s.charAt(j) == '.') break;

	            if (s.substring(i-2, i+1).equals("abc"))
	                return true;
	        }
	        return false;
	    }
}
