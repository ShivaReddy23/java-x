
public class A31 {
	public static void main(String[] strings) {

		int[] num_array = new int[]{10, 77, 10, 54, -11, 10};
		int sum =0;
		for (int i =0; i< num_array.length;i++){

		if (num_array[i]==10){
		sum+=num_array[i];
		}
		}
		if (sum==30){
		System.out.println("true");
		}
		else System.out.println("false");
		}

		
}
