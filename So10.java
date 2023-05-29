import java.util.Arrays;
public class So10 {
	    void cocktailSort(int nums[])
	    {
		  boolean swapped;
		  do {
			swapped = false;
			for (int i =0; i<=  nums.length  - 2;i++) {
				if (nums[ i ] > nums[ i + 1 ]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1]=temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
			swapped = false;
			for (int i= nums.length - 2;i>=0;i--) {
				if (nums[ i ] > nums[ i + 1 ]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1]=temp;
					swapped = true;
				}
			}
		} while (swapped);
	}
	    public static void main(String args[])
	    {
	    	So10 ob = new So10();
	        int nums[] = {7, 5, 3, 2, 1, 12, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.cocktailSort(nums);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(nums));
	    }
}
