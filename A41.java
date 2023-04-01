
public class A41 {
	public static void main(String[] args){
		int[] array = { 31, 4, 3, 9, 4, 9, 1, 49 };
		int smallest = array[0];
		int secondSmallest = array[0];

		for(int i = 0; i < array.length; i++){
		if(array[i] < smallest){
		smallest = array[i];
		}
		}

		for(int i = 0; i < array.length; i++){
		if(array[i] < secondSmallest && array[i] != smallest){
		secondSmallest = array[i];
		}
		}
		System.out.println(secondSmallest);
		System.out.println(smallest);
		}
		}

