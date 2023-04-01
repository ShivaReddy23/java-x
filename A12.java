	import java.util.Arrays;
public class A12 {
	public static void main(String[] args){
	int[] arr = {1, 1, 2, 7, 5, 4, 7, 8};
	Arrays.sort(arr);
	int[] dup;
	System.out.println(Arrays.toString(arr));
	for(int i = 0; i < arr.length - 1; i++){
	if(arr[i] == arr[i+1]){
	System.out.println(arr[i+1]);
	}
	}
	}
}
