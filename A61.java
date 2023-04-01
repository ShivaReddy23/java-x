import java.util.Arrays;
public class A61 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
	        System.out.println("Original array: \n" + Arrays.toString(myArray));

	        Arrays.sort(myArray);
	        for (int i = 1; i < myArray.length; i++){
	            if (i % 2 == 0){
	                int temp = myArray[i];
	                myArray[i] = myArray[i-1];
	                myArray[i-1] = temp;
	            }
	        }
	        System.out.println("\nArray with every second element is greater than its left and right elements:\n"
	                           + Arrays.toString(myArray));
	    }

	}

