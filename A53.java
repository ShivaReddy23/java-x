import java.util.Arrays;
public class A53 {
	    public static void main(String[] args) throws Exception {
	        int[] nums = {45, 20, 100, 23, -5, 2, -6};
	        System.out.println("Original Array\n" + Arrays.toString(nums));

	        for (int i = 0; i < nums.length; i++) {
	            int maxi = Integer.MIN_VALUE;
	            for (int j = i+1; j < nums.length; j++) {
	                if (maxi < nums[j])
	                    maxi = nums[j];
	            }
	            if (i == nums.length-1)
	                nums[i] = -1;
	            else
	                nums[i] = maxi;
	        }
	        System.out.println("The modified array:\n" + Arrays.toString(nums));
	    }
	}

