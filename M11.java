import java.util.Scanner;
public class M11 {
	    public static void main(String[] args) throws Exception {
	        Scanner input = new Scanner(System.in);
	        System.out.print("1. A password must have at least eight characters.\n" +
	                           "2. A password consists of only letters and digits.\n" +
	                           "3. A password must contain at least two digits\n" +
	                           "Input a password (You are agreeing to the above Terms and Conditions.): ");

	        String str = input.nextLine();
	        boolean b = password(str);
	        if (b)
	            System.out.println("Password is valid: " + str);
	        else
	            System.out.println("NOT a valid password: " + str);

	    }
	    public static boolean password(String s){
	        if (s.length() < 8)
	            return false;
	        int l = 0;
	        int d = 0;
	        for (int i = 0; i < s.length(); i++){
	            if (Character.isLetter(s.charAt(i)))
	                l++;
	            if (Character.isDigit(Integer.valueOf(s.charAt(i))))
	                d++;
	        }
	        return l+d == s.length() && d >= 2;
	    }

}
