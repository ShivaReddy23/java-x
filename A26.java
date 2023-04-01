import java.util.Arrays;
public class A26 {
public static void main(String[] args) {

	int[] a = {0, 5, 0, 1, 0, 8, 7};

	System.out.println("input = " + Arrays.toString(a));

	int j = 0;
	for(int i = 0; i < a.length; i++) {
	if (j != i && a[i] != 0) {
	a[j] = a[i];
	a[i] = 0;
	j++;
	}
	}

	System.out.println("output = " + Arrays.toString(a));
	}
	}

