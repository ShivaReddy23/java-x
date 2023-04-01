import java.util.Arrays;
public class A71 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {1, 2, 3, 0, 4, 6};
	        System.out.println("Original array: " + Arrays.toString(myArray));
	        Arrays.sort(myArray);
	        long large = 0;
	        for (int i = myArray.length-1; i >= 0; i--)
	            large = large * 10 + myArray[i];
	        System.out.println("Largest number using the said array numbers: " + large);
	    }
	}

