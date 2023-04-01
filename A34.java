import java.util.Arrays;
public class A34 {
	public static void main(String[] args) {
		int[] a = { 49, 1, 3, 200, 4, 70, 71, 5, 6 };

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int ans = 0, count = 0;
		int i = a[0];
		for (int j = 1; j <= a.length; ++j) {
		if (a[j - 1] == i) {
		++count;
		++i;
		ans = Math.max(ans, count);
		} else {
		if (j != a.length) {
		count = 0;
		i = a[j];
		}
		}

		}
		System.out.println(ans);
		}
		}
	

