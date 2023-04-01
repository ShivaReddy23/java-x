import java.util.Arrays;
public class A52 {
	    public static void main(String[] args) throws Exception {
	        int[] nums = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
	        System.out.println("Original Array\n" + Arrays.toString(nums));

	        int mICond = 0;
	        for (int mAl = 1; mAl < nums.length; mAl++){
	            if (nums[mICond] % 2 == 1 && nums[mAl] % 2 == 0){
	                int temp = nums[mAl];
	                nums[mAl] = nums[mICond];
	                nums[mICond] = temp;
	                mICond++;
	            }
	            if (nums[mICond] % 2 == 0) mICond++;
	        }
	        System.out.println("Array after separation\n" + Arrays.toString(nums));
	    }
	}
