
public class A13 {
	public static void main(String[] args) {
		String[] names = { "Tom", "Jerry", "Jerry", "Tom", "Pam" };

		compare(names);

		}

		public static boolean compare(String[] arr) {
		boolean duplicates = false;
		for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length; j++) {
		if (arr[i] == arr[j] && i != j) {
		System.out.println("Element '" + arr[i] + "' is duplicated.");
		duplicates = true;
		}
		}
		}
		return duplicates;
		}
		}