import java.util.Arrays;
public class p78 {
	 public static void main(String[] args)
	 {
		
		int[] n = {5, 7};
		System.out.println("Original Array: "+Arrays.toString(n)); 
		if(n[0] == 4 || n[0] == 7)
			System.out.println("True");
		else
	    System.out.println(n[1] == 4 || n[1] == 7);
		 
	 }
	}