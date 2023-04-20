public class St107 {
	 public static void main(String[] args) throws Exception {
	        String str = "asdefjnvw;i'aj'djdhdnackadsndjbcdj";
	        char ch = 'd';
	        System.out.println("The given string is: " + str);
	        int c = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ch) c++;
	        }
	        System.out.println(ch + " occurs " + c + " times");

	    }
}
