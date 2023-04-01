import java.util.Arrays;
public class A49 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
	        System.out.println("Original Array: " + Arrays.toString(myArray));

	        int mInCon = 0;
	        for (int i = 0; i < myArray.length; i++){
	            if (myArray[mInCon] < 0 && myArray[i] >= 0){
	                int temp = myArray[mInCon];
	                myArray[mInCon] = myArray[i];
	                myArray[i] = temp;
	                mInCon++;
	            }
	            if (myArray[mInCon] >= 0)
	                mInCon++;
	        }
	        System.out.println("New Array: " + Arrays.toString(myArray));
	    }
	}

