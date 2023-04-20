
public class St21 {
	public static void main (String[] arg){
		String str = "The quick brown fox jumps over the lazy dog.";
		char letter ='a';
		while (letter<='z'){
		System.out.println("last index of "+letter+" is "+str.lastIndexOf(letter));
		letter++;
		}

		}
}
