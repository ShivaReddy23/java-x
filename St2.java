
public class St2 {
	public static void main (String[] arg){
		String m = "Shivani.com";
		System.out.println("the original: "+m);
		int a = m.codePointAt(1);
		int b = m.codePointAt(10);
		System.out.println("Character(unicode point) = "+a);
		System.out.println("Character(unicode point) = "+b);
	}
}
