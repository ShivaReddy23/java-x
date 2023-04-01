
public class A16 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 9, 55, 7, 1, 2, 4, 9};

		System.out.print("After remove duplicated elements from the array is : ");
		for (int i = 0; i < arr.length; i++) {
		for (int x = i + 1; x < arr.length; x++) {
		if (arr[i] == arr[x]) {
		arr[i] = 0;
		arr[x] = 0;
		}
		}
		}
		for(int p = 0;p < arr.length;p++){
		if(arr[p] != 0)
		System.out.print(arr[p]+"\t");
		}

		}

		
}
