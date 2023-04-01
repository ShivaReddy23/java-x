	import java.util.Arrays;
public class A32 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {77, 77, 65, 65, 65, 77};
	        System.out.println("Original Array: " + Arrays.toString(myArray));

	        int firstSpecifiedNum = 65;
	        int secondSpecifiedNum = 77;

	        boolean shiv1 = false;
	        boolean shiv2 = false;

	        for (int i = 0; i < myArray.length; i++){
	            if (shiv1 && shiv2)
	                break;
	            if (myArray[i] == firstSpecifiedNum)
	                shiv1 = true;
	            if (myArray[i] == secondSpecifiedNum)
	                shiv2 = true;
	        }
	        System.out.println("Result: " + (shiv1 && shiv1));
	    }
	}

