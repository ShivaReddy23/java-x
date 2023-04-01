	import java.util.Arrays;
public class A38 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2};
	        System.out.println("Original Array : " + Arrays.toString(myArray));

	        int majorityElement = -1;
	        for (int i = 0; i < myArray.length; i++){
	            int tempCount = 0;
	            for (int j = 0; j < myArray.length; j++){
	                if (myArray[i] == myArray[j] )
	                    tempCount++;
	            }
	            if (tempCount > (myArray.length / 2)){
	                majorityElement = myArray[i];
	                break;
	            }
	        }
	        if (majorityElement == -1)
	            System.out.println("Majority element does not exist");
	        else
	            System.out.println("Majority element is " + majorityElement);
	    }
	}
