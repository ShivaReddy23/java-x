import java.util.Arrays;
public class A56 {
	    public static void main (String[] args) {
	        int arra_nums[] = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
	        System.out.println("Original array : "+Arrays.toString(arra_nums));
	        int len = arra_nums.length;

	        int zeroNum = 0;
	        for (int i = 0; i < len; i++){
	            if (arra_nums[i] == 0) zeroNum++;
	        }

	        for (int i = 0; i < len; i++){
	            if (zeroNum > 0){
	                arra_nums[i] = 0;
	                zeroNum--;
	            } else
	                arra_nums[i] = 1;
	        }
	        System.out.println("After sorting: " + Arrays.toString(arra_nums));
	    }
	}
