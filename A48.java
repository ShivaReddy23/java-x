import java.util.Arrays;
public class A48 {
	public static void main(String[] args){
	int[] array = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};

	for(int i = 0; i < array.length; i++){
	for(int j = 0; j < array.length; j++){
	if(array[i] < array[j]){
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
	}
	}
	}

	System.out.println(Arrays.toString(array));
	}
}
