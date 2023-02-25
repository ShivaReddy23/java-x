public class p23sum {
	static int smallestSubarraySumK(int[] arr, int k)
	  {
	    int result = Integer.MAX_VALUE;
	 
	    for (int i = 0; i < arr.length; ++i) {
	      int sum = 0;
	      for (int j = i; j < arr.length; j++) {
	        sum += arr[j];
	        if (sum == k) {
	          result = Math.min(result, (j - i + 1));
	        }
	      }
	    }
	 
	    // Return result
	    return result;
	  }
	 
	  public static void main (String[] args) {
	 
	    int[] arr = { -2, -1, -3, 4 };
	    int k = 5;
	 
	    int result = smallestSubarraySumK(arr, k);
	    if (result == Integer.MAX_VALUE)
	      System.out.println(-1);
	    else
	      System.out.println(result);
	  }
	}
	 
