import java.util.Arrays;
public class A44 {
	public static void main(String[] args){
		int[] array = { 6, 7, 9, 16, 25, 12, 30, 40 };
		int count = 0;

		Arrays.sort(array);

		for(int i = 0; i < array.length-2; i++){
		for(int j = i+1; j < array.length-1; j++){
		for(int k = j+1; k < array.length; k++){
		if(array[i] + array[j] > array[k] && array[i] + array[j] != array[k]) {
		count++;
		System.out.println(array[i] + " " + array[j] + " " + array[k]);
		}
		}
		}
		}
		System.out.println(count);
		}
		
}
