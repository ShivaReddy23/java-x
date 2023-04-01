
public class A40 {
	public static void main(String[] args){
		int arr[] = {1, 5, -4, 7, 8, -6};
		int lowestSum = 999999;
		int element1 = 0;
		int element2 = 0;
		for(int i = 0; i < arr.length; i++){
		for(int j = i + 1; j < arr.length; j++){
		int sum = Math.abs(arr[i] + arr[j]);
		if(sum < lowestSum){
		lowestSum = sum;
		element1 = arr[i];
		element2 = arr[j];
		}
		}
		}
		System.out.println(element1 + " " + element2);
		}
		
}
