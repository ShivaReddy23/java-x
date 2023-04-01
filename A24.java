
public class A24 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 7 };
		int i = a[0];
		for (int j = 0; j < a.length; ++j) {
		if (i != a[j]) {
		System.out.println(i);
		break;
		}
		++i;
		}
		}
}
