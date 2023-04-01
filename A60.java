import java.util.Arrays;
	
public class A60 {
	    public static void main (String[] args) {
	        int arra_nums[] = {1, 2, 3, 4, 5, 6};
	        System.out.println("Original array : "+Arrays.toString(arra_nums));
	        for (int i = 0; i < arra_nums.length; i++) {
	            int random = ((int) (Math.random() * 10)) % 6;
	            int temp = arra_nums[i];
	            arra_nums[i] = arra_nums[random];
	            arra_nums[random] = temp;
	        }
	        System.out.println("Shuffle Array: " + Arrays.toString(arra_nums));
	    }
	}

