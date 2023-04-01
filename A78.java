import java.util.Scanner;
	import java.util.Arrays;
	import java.util.stream.IntStream;
public class A78 {
	  public static void main(String[] args) {
	    int[] nums = {1,-2, -5,-4,3,-6};
	    System.out.printf("Original array of numbers:\n" + Arrays.toString(nums));
	    boolean result = test(nums);
	    System.out.printf("\nCheck Negative Dominance in the said array!" + result);
	  }
	public static boolean test(int[] nums) {
	    return IntStream.of(nums).distinct().filter(element -> element < 0).count()>
	           IntStream.of(nums).distinct().filter(element -> element > 0).count();
	   }
	}

