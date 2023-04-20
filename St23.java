
public class St23 {
	public static void main(String[] args) {
		String str1 = "The bad ,black fox jumps over the lazy dog.";
		String str2 = "The fast yellow tiger jumps The bad active dog.";
		boolean s1 = str1.substring(0, 7).equals(str2.substring(28, 35));
		boolean s2 = str1.substring(9, 15).equals(str2.substring(9, 15));
		System.out.println("str1[0 - 7] == str2[28 - 35]? "+ s1);
		System.out.println("str1[9 - 15] == str2[9 - 15]? "+ s2);
		}
		}
