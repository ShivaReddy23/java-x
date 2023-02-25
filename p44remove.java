import java.util.Arrays;
public class p44remove {
	
	 
	    public static int[] removeElements(int[] arr, int key)
	    {
	        int index = 0;
	        for (int i=0; i<arr.length; i++)
	            if (arr[i] != key)
	                arr[index++] = arr[i];
	 
	        return Arrays.copyOf(arr, index);
	    }
	    public static void main(String[] args)
	    {
	        int[] array = { 1,4,6,7,6,2 };
	        int key = 6;
	        array = removeElements(array, key);
	        System.out.println(Arrays.toString(array));
	    }
	}

