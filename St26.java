
public class St26 {
	 public static void main(String[] args) throws Exception {
	        String s1 = "Red is favorite color.";
	        String s2 = "Orange is also my favorite color.";
	        String keyWord = "Red";
	        boolean ss1 = false;
	        boolean ss2 = false;

	        if (s1.substring(0, keyWord.length()).equals(keyWord))
	            ss1 = true;
	        if (s2.substring(0, keyWord.length()).equals(keyWord))
	            ss2 = true;

	        System.out.printf("%s starts with %s? %s\n", s1, keyWord, ss1);
	        System.out.printf("%s starts with %s? %s", s2, keyWord, ss2);
	    }
}
