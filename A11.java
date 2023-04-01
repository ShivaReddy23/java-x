import java.util.*;
public class A11 {
	public static void main(String[] args) {
	int[] a = {4, 5, 3, 1, 9, 8};
	int[] b = new int[a.length];
	int number = 0;
	for (int i = a.length-1; i >= 0; i--) {
	b[number] = a[i];
	number++;
	}
	System.out.println(Arrays.toString(b));
	}
	}

