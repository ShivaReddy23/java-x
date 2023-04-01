	import java.util.Arrays;
public class A51 {
	public static void main(String[] args){
	int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	System.out.println("Original Array: "+Arrays.toString(nums));
	int[] nums2=new int[nums.length];
	int j=0,k=1;
	for(int i=nums.length-1;i>=0;i--) {
	nums2[j]=nums[i];
	j+=2;
	if(j==nums.length) break;
	}
	for(int i=0;i<=nums.length;i++) {
	nums2[k]=nums[i];
	k+=2;
	if(k==nums.length+1) break;
	}
	System.out.println("New Array: "+Arrays.toString(nums2));
	}
	}

