public class NP5array {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println("Original array: \n");

		for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
		System.out.print(a[i][j] + " ");
		}
		System.out.println(" ");
		}
		System.out.println("New array: \n");

		for (int i = 0; i < a[0].length; i++) {
		for (int j = 0; j < a.length; j++) {
		System.out.print(a[j][i] + " ");
		}
		System.out.println(" ");

		}
		}
		}
	