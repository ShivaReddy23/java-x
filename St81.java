
public class St81 {
	 public static void main(String[] args) throws Exception {
	        String str = "redcapmanwithbluecar";
	        System.out.println("The given string is: " + str);

	        int b = 0;
	        int r = 0;
	        for (int i = 3; i <= str.length(); i++){
	            if (i+1 <= str.length()) {
	                if (str.substring(i-3, i+1).equals("blue"))
	                    b++;
	            }
	            if (str.substring(i-3,i).equals("red"))
	                r++;
	        }
	        System.out.println("The appearance of red and blue are same: " + (b == r));
	    }
}
