
public class A28 {
	public static void main(String[] args) {
		int[] a = {1, 41, 16, 4, 6, 9, 13};
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
		if(a[i] > max) {
		max = a[i];
		}
		if(a[i] < min) {
		min = a[i];
		}
		}
		System.out.println("Difference between smallest and largest number: " + (max - min));
		}
		
}
