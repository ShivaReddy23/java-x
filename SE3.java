public class SE3 {
	public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int search_num = 120;
       int index_result = jumpSearch(nums, search_num);

       System.out.println(search_num + " is found at index " + index_result);

	}
	
	    public static int jumpSearch(int[] nums, int item)	    {
	        
	    	int array_size = nums.length;
	        int block_size = (int)Math.floor(Math.sqrt(array_size));
	 
	        int prev_item = 0;
	        while (nums[Math.min(block_size, array_size)-1] < item)
	        {
	            prev_item = block_size;
	            block_size += (int)Math.floor(Math.sqrt(array_size));
	            if (prev_item >= array_size)
	                return -1;
	        }
	 
	       
	        while (nums[prev_item] < item)
	        {
	            prev_item++;
	            if (prev_item == Math.min(block_size, array_size))
	                return -1;
	        }
	        if (nums[prev_item] == item)
	            return prev_item;
	 
	        return -1;
	    } 	    
}
