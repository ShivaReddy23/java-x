import  java.util.Arrays;
public class A33 {
	public static void main(String[] args) {

		int[] a = { 12, 12, 23, 23, 45, 45, 67, 67 };
		int[] b = new int[a.length / 2];
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
		if (a[i] == a[i + 1]) {
		b[j++] = a[i];
		}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("Length: "+b.length);

		}
		}

