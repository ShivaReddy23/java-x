import java.util.Arrays;
	import java.util.stream.IntStream;
public class p96 {
	    private static void check(int[] arr, int toCheckValue)
	    {
	        boolean test = false;
	        for (int element : arr) {
	            if (element == toCheckValue) {
	                test = true;
	                break;
	            }
	        }
	 
	        System.out.println( test);
	    }
	 
	    public static void main(String[] args)
	    {
	        int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
	 
	        int toCheckValue = 0;
	 
	        System.out.println("Array: "
	                           + Arrays.toString(arr));
	 
	        check(arr, toCheckValue);
	    }
	}
