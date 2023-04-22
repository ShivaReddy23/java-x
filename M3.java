import java.util.Locale;
	import java.util.Scanner;
public class M3 {
	    public static void main(String[] args) throws Exception {
	        Scanner input = new Scanner(System.in).useLocale(Locale.US);
	        System.out.print("Input a string: ");
	        String str = input.next();

	        System.out.println("The middle character in the string: " + midChar(str));
	    }
	    public static String midChar(String s){
	        int len = s.length();
	        if (len % 2 == 1)
	            return s.charAt(len / 2)+"";
	        else
	            return s.charAt(len/2-1) +""+ s.charAt(len/2);
	    }
}
