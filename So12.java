import java.util.Arrays;
public class So12 {
	    void countingSort(int[] nums, int min, int max){
		  int[] ctr = new int[max - min + 1];
		  for(int number : nums){
			ctr[number - min]++;
	    	}
		  int z= 0;
		  for(int i= min;i <= max;i++){
			 while(ctr[i - min] > 0){
			 	nums[z]= i;
			 	z++;
				ctr[i - min]--;
			   }
		   }
	  }
	    public static void main(String args[])
	    {
	    	So12 ob = new So12();
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        int minValue = -5, maxValue = 45;
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.countingSort(nums,minValue,maxValue);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(nums));
	    }
}
