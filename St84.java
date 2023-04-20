
public class St84 {
	 public static void main(String[] args) throws Exception {
	        String str = "welcome";
	        int p = 4;
	        System.out.println("The given string is: " + str);
	        System.out.println("Number of repetition characters and repetition: " + p);

	        String s = "";
	        while (p > 0){
	            s += str.substring(0, p);
	            p--;
	        }
	        System.out.println("The new string is: " + s);
	    }
}
