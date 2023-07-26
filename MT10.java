import java.util.Arrays;
public class A10 {
	public static void main(String[] args) {

	int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

	int Index_position = 1;
	System.out.println("Original Array : "+Arrays.toString(my_array));

	for(int i = Index_position; i < my_array.length-1; i++){
	Arrays.sort(my_array);

	}
	System.out.println("Max is: "+ my_array[my_array.length-1]);
	for(int i = Index_position; i < my_array.length-1; i++){
	Arrays.sort(my_array);
	}
	System.out.println("Min is: "+ my_array[0]);

	}
	}

