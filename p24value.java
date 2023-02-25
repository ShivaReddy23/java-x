import java.util.Arrays;
public class p24value {
	
	    public static int findIndex(int arr[], int t)
	    {
	  
	        int index = Arrays.binarySearch(arr, t);
	        return (index < 0) ? -1 : index;
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] my_array = { 1,2,4,5,6 };
	  
	        System.out.println("Index position of 5 is: "
	                           + findIndex(my_array, 5));
	  
	    }
	}