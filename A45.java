import java.util.Arrays;
public class A45 {
	    public static void main(String[] args) throws Exception {
	        int nums[] = {10, 20, 30, 40, 50, 60};
	        System.out.println("Original arraay:\n"+ Arrays.toString(nums));


	        for (int i = nums.length-1; i > 0 ; i--){
	            int temp = nums[i];
	            nums[i] = nums[i-1];
	            nums[i-1] = temp;
	        }
	        System.out.println("Rotated arraay:\n" + Arrays.toString(nums));
	    }
	}

