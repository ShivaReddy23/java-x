import java.util.Scanner;
public class St9 {
	 public static void main(String[] args) {
	        String s1 = "example.com";
	        String s2 = "Example.com";
	        CharSequence cs = "example.com";

	        String s = s1;
	        for (int j = 0; j < 2; j++){
	            if (s.length() != cs.length()) {
	                System.out.printf("Comparing %s and %s: %s\n", s, cs, false);
	            } else {
	                boolean flog = true;
	                for (int i = 0; i < s.length(); i++) {
	                    if (s.charAt(i) != cs.charAt(i)) {
	                        flog = false;
	                        break;
	                    }
	                }
	                System.out.printf("Comparing %s and %s: %s\n", s, cs, flog);

	            }
	            s = s2;
	        }

	 }}