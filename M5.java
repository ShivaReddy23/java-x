import java.util.Locale;
	import java.util.Scanner;
public class M5 {
	    public static void main(String[] args) throws Exception {
	        Scanner input = new Scanner(System.in).useLocale(Locale.US);
	        System.out.print("Input the string: ");
	        String str = input.nextLine();

	        System.out.println("Number of words in the string: " + numOfWords(str));
	    }
	    public static int numOfWords(String s){
	        String[] string = s.split(" ");
	        return string.length;
	    }

}
