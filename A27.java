
public class A27 {
	public static void main(String[] args) {
		int[] a = {1, 41, 16, 4, 6, 9, 13};
		int odd = 0;
		int even = 0;
		for (int i = 0; i < a.length; i++) {
		if(a[i] % 2 == 0) {
		even++;
		}else{
		odd++;
		}
		}
		System.out.println("count of even numbers: " + even);
		System.out.println("count of odd numbers: " + odd);
		}
		
}
