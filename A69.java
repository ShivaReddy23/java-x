import java.util.Arrays;
public class A69 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        System.out.println("Original array: " + Arrays.toString(myArray));
	        int k = 4;
	        System.out.println("Sub-array size: " + k);

	        int smallestSum = Integer.MAX_VALUE;
	        int s = 0;
	        int e = 0;
	        for (int i = 0; i < myArray.length-3; i++) {
	            int sum = 0;
	            for (int j = i; j < k + i; j++) {
	                sum += myArray[j];
	            }
	            if (sum < smallestSum) {
	                smallestSum = sum;
	                s = i;
	                e = k+i;
	            }
	        }
	        System.out.printf("Sub-array from %d to %d and sum is: %d", s, e-1, smallestSum);
	    }
	
}
