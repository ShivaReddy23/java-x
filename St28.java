import java.util.Arrays;
public class St28 {
	    public static void main(String[] args) throws Exception {
	        String str = "Java Exercises.";
	        char[] charsOfStr = new char[str.length()];

	        for (int i = 0; i < str.length(); i++){
	            charsOfStr[i] = str.charAt(i);
	        }
	        System.out.println(Arrays.toString(charsOfStr));
	        System.out.println(charsOfStr);


	    }
}
