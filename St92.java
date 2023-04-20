
public class St92 {
	public static String removeString(String str, String st){
		str = str.toLowerCase();
		return str.replaceAll(st,"");
		}

		public static void main(String[] args) {
		String str = "This is the test string";
		String st = "st";
		System.out.println("The given String is: " + str + " the target for removing is: " + st);
		System.out.println("The new String after removing: " + removeString(str,st));
		}
}
