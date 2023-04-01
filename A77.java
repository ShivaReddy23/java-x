import java.util.Scanner;
	import java.util.Arrays;
public class A77 {
	  public static void main(String[] args) {
	   int[] nums = {1, 2 ,5, 4, 3, 6};
	    System.out.printf("\nOriginal array: " + Arrays.toString(nums));

	    boolean result = test(nums);
	    System.out.printf("\nCheck the said array of integers alternates between positive and negative values!" + result);
	  }

	  public static boolean test(int[] nums) {
	    if (nums.length == 1 && nums[0] == 0)
	      return false;
	    for (int i = 0; i < nums.length - 1; i++)
	      if (nums[i] * nums[i + 1] >= 0)
	        return false;
	    return true;
	  }
	}

