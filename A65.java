import java.util.Arrays;
public class A65 {
	 public static void main(String[] args) throws Exception {
	        int[] myArray = {2, 3, 1, 7, 9, 5, 11, 3, 5};
	        System.out.println("Original array: " + Arrays.toString(myArray));
	        int maxDifference = Integer.MIN_VALUE;
	        for (int i = myArray.length-1; i >= 0; i--){
	            for (int j = i-1; j >= 0; j--){
	                int differ = myArray[i] - myArray[j];
	                if (maxDifference < differ)
	                    maxDifference = differ;
	            }
	        }
	        System.out.println("The maximum difference between two elements of the said array elements\n" + maxDifference);
	    }
	}

