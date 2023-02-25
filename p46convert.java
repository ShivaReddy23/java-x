public class TreeNode {
		  TreeNode left;
		  TreeNode right;
		  int value;
		}
		

		public TreeNode createBalancedBST(int[] nums, int start, int end) {
		  if(start>end) {
		    return null;
		  }
		  
		  TreeNode root = new TreeNode();
		  int mid = (start+end)/2;
		  
		  root.value = nums[mid];
		  root.left = createBalancedBST(nums, start, mid-1);
		  root.right = createBalancedBST(nums, mid+1, end);
		  
		  return root;
		}

		public TreeNode sortedArrayToBST(int[] nums) {
		  return createBalancedBST(nums, 0, nums.length-1);
		}
}