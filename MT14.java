
public class A14 {
	public static void main(String[] args) {
		String[] name = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };
		String[] name2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

		compareArrays(name, name2);

		}

		public static boolean compareArrays(String[] arr, String[] arr2) {
		boolean duplicate = false;
		for (int i = 0; i < arr.length; i++) {
		for (int k = 0; k < arr2.length; k++) {
		if (arr[i] == arr2[k]) {
		System.out.println("There is '" + arr[i] + "' common element.");
		duplicate = true;
		}
		}
		}
		return duplicate;
		}

		}

