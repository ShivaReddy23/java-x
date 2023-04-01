import java.util.Arrays;
public class A50 {
	    public static void main(String[] args) throws Exception {
	        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	        System.out.println("Original Array\n" + Arrays.toString(nums));

	        int[] newArray = new int[nums.length];
	        Arrays.sort(nums);
	        int maxi = nums.length-1;
	        int mini = 0;
	        for (int i = 0; i < nums.length; i++){
	            if (i % 2 == 0) newArray[i] = nums[maxi--];
	            else newArray[i] = nums[mini++];
	        }
	        System.out.println("New Array\n" + Arrays.toString(newArray));
	    }
	}

