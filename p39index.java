import java.util.HashSet;
	import java.util.Set;
	
public class p39index {
	
	    static Boolean subArrayExists(int arr[])
	    {
	        Set<Integer> hs = new HashSet<Integer>();
	 
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {

	            sum += arr[i];
	            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
	                return true;
	            hs.add(sum);
	        }
	        return false;
	    }
	    public static void main(String arg[])
	    {
	        int arr[] = {1, 2, 3, -6, 5, 4};
	 
	        if (subArrayExists(arr))
	            System.out.println(
	                "Found a subarray with 0 sum");
	        else
	            System.out.println("No Such Sub Array Exists!");
	    }
	}
