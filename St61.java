
public class St61 {
	 public static void main(String[] args) throws Exception {
	        String str = "Welcome";
	        int num = 3;
	        System.out.println("The given strings is: " + str
	                           + "\nThe given numbers is: " + num);
	        System.out.print("The new string is: ");
	        for (int i = 0; i < str.length(); i++) {
	            if (i == num) continue;
	            System.out.print(str.charAt(i));
	        }
	    }
}
