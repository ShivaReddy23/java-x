import java.util.Arrays;
public class p4last {
	public static void main(String[] args){

		int[] numArray = {11, 20, 23, 10, 45, 20, 33, 53}, newArray;
		int l = numArray.length - 1, index = 10;

		System.out.println("Original Array: " + Arrays.toString(numArray));

		while(numArray[l] != index){

		l--;
		}

		newArray = new int[l];

		for(int i = 0; i < l; i++){

		newArray[i] = numArray[i];
		}

		System.out.println("New Array: " + Arrays.toString(newArray));
		}
		}