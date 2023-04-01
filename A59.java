import java.util.Arrays;
public class A59 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {2, 3, 5, 7, -7, 5, 8, -5};
	        System.out.println("Original array: " + Arrays.toString(myArray));

	        int maxProduct = Integer.MIN_VALUE;
	        int index1 = -1;
	        int index2 = -1;
	        for (int i = 0; i < myArray.length; i++){
	            for (int j = 0; j < myArray.length; j++){
	                if (i == j) continue;
	                int prod = myArray[i] * myArray[j];
	                if (maxProduct < prod) {
	                    index1 = i;
	                    index2 = j;
	                    maxProduct = prod;
	                }
	            }
	        }
	        System.out.printf("Pair is (%d, %d), Maximum Product: %d",
	                          myArray[index1], myArray[index2], maxProduct);
	    }

	}

