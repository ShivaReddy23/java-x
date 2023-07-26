import java.util.Arrays;
public class A15 {
	public static void main(String[] args) {

	int[] my_array= {1,2,3,4,5};
	int[] my_array2= {2,7,9,10,11,14,5};
	System.out.println("Original Array : "+Arrays.toString(my_array));
	System.out.println("The common values of the two arrays : ");
	for(int i= 0; i<= my_array.length-1; i++){
	for (int j = 0; j<=my_array2.length-1; j++) {

	if (my_array2[j] == my_array[i])
	System.out.println(my_array2[j]);
	}

	}

	}
	}

