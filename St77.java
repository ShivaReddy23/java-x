
public class St77 {
	 public static void main(String[] args) throws Exception {
	        String str1 = "try";
	        String str2 = "best";
	        System.out.println("The given strings are: " + str1 + " and " + str2);
	        int nRep = 3;
	        System.out.println("Number to times to be repeat: " + nRep);

	        String newStr = "";
	        for (int i = 0; i < nRep*2-1; i++){
	            if (i % 2 == 0)
	                newStr += str1;
	            else
	                newStr += str2;
	        }
	        System.out.println("The new string is: " + newStr);
	    }
}
