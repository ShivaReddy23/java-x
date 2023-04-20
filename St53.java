
public class St53 {
	public static void main (String[] arg) {

		String str = "abcdhgh";
		String str_wild = "abc*d?*";
		int count=0;

		for ( int i = 0; i < str.length(); i++) {
		boolean x =String.valueOf(str_wild.charAt(i)).equals("*");
		boolean y =String.valueOf(str_wild.charAt(i)).equals("?");
		if (str.charAt(i)!=str_wild.charAt(i)){
		if (i==0){
		if (x){
		count=0;
		} else if (y){
		count=0;
		} else count=1; break;

		}
		else if (x ||String.valueOf(str_wild.charAt(i-1)).equals("*")){
		count=0;
		} else if (y){
		count=0;
		} else count=1;break;
		}

		}
		if (count==0){
		System.out.println("the given pattern is matching.");
		}
		else System.out.println("the given pattern is not matching.");

		}
}
