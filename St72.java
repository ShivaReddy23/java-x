
public class St72 {
	public static boolean checkIfContainPop(String str) {
		boolean flag = false;
		for (int i=0;i<=str.length()-3;i++) {
		if (str.charAt(i) == 'p' && str.charAt(i+2) == 'p') {
		flag = true;
		}
		}
		return flag;
		}
		public static void main(String[] args) {
		String s1 = "dikchapop", s2 = "dikp$pdik";
		System.out.println("The given string is: " + s1);
		System.out.println("Is p?p appear in the given string? " + checkIfContainPop(s1)+"\n");
		System.out.println("The given string is: " + s2);
		System.out.println("Is p?p appear in the given string? " + checkIfContainPop(s2));
		}
}
