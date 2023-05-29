import java.util.Arrays;
public class So7 {
	  void InsertionSort(int[] nums){
	  for(int i = 1; i < nums.length; i++){
	    int value = nums[i];
	    int j = i - 1;
	    while(j >= 0 && nums[j] > value){
	      nums[j + 1] = nums[j];
	      j = j - 1;
	    }
	    nums[j + 1] = value;
	  }
	}
	    public static void main(String args[])
	    {
	    	So7 ob = new So7();
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.InsertionSort(nums);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(nums));
	    }
}
 