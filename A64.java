import java.util.Arrays;
public class A64 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5};
	        System.out.println("Original array: " + Arrays.toString(myArray));
	        int sI = 0;
	        int eI = 0;
	        int fSi = 0;
	        int fEi = 0;
	        for (int i = 0; i < myArray.length; i++){
	            boolean flogAscend = false;
	            boolean flogDscend = false;
	            boolean f = false;
	            boolean b = false;
	            sI = i;
	            int p = 0;
	            for (int j = i+1; j < myArray.length; j++){
	                if (myArray[j-1] < myArray[j]){
	                    flogAscend = true;
	                    p = j;
	                } else break;
	            }
	            for (int j = p+1; j < myArray.length; j++){
	                if (myArray[j-1] > myArray[j]){
	                    flogDscend = true;
	                    eI = j;
	                } else break;
	            }

	            if (flogAscend && flogDscend){
	                if ((fEi-fSi) < (eI-sI)) {
	                    fEi = eI;
	                    fSi = sI;
	                }
	            }
	        }
	        System.out.printf("The longest bitonic subarray is [%d,%d]\n", fSi, fEi);
	        System.out.print("Elements of the said sub-array: ");
	        for (int i = fSi; i <= fEi; i++)
	            System.out.print(myArray[i] + " ");
	        System.out.println("\nThe length of longest bitonic subarray is " + (fEi+1-fSi));
	    }
}
