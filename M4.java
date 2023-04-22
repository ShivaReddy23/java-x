import java.util.Locale;
	import java.util.Scanner;
public class M4 {
	    public static void main(String[] args) throws Exception {
	        Scanner input = new Scanner(System.in).useLocale(Locale.US);
	        System.out.print("Input the string: ");
	        String str = input.next();

	        System.out.println("Number of  Vowels in the string: " + numOfVowels(str));
	    }
	    public static int numOfVowels(String s){
	        String vowels = "aeoiu";
	        int countVowels = 0;
	        for (int i = 0; i < s.length(); i++){
	            if (vowels.contains(String.valueOf(s.charAt(i)))) countVowels++;
	        }
	        return countVowels;
	    }
}
