
public class St3 {
	 public static void main(String[] args) {
	        String str = "Shivani.com";;
	        System.out.println("Original String = "+str);

	        int v1 = str.codePointBefore(1);
	        int v2 = str.codePointBefore(9);

	        System.out.println("Character(unicode point) = "+v1);
	        System.out.println("Character(unicode point) = "+v2);
	    }
}
