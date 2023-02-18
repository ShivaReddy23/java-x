import java.util.Arrays;
	 
public class p81 {
	
	   public static void main(String args[]) {
	      int[] arr = { 20, 30, 40};
	      System.out.println(Arrays.toString(arr));
	      swapElements(arr);
	      System.out.println(Arrays.toString(arr));
	   }
	 
	   public static void swapElements(int[] arr) {
	      int tmp = arr[0];
	      arr[0] = arr[arr.length - 1];
	      arr[arr.length - 1] = tmp;
	   }
	}
	 

