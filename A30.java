import java.util.Arrays;
public class A30 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray = {50, 77, 12, 54, -11};
	        System.out.println("Original Array: " + Arrays.toString(myArray));

	        boolean shiv = true;
	        for (int x: myArray){
	            if (x == -1 || x == 0) {
	                shiv = false;
	                break;
	            }
	        }
	        System.out.println("Result: " + shiv);
	   }
}
