import java.util.Arrays;
public class A73 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray1 = {3, 5, 6, 9, 8, 7};
	        System.out.println("Original array: " + Arrays.toString(myArray1));
	        System.out.println("\nAfter sorting new array becomes: "
	                           + Arrays.toString(sorty(myArray1)));

	        int[] myArray2 = {5, 0, 1, 2, 3, 4, -2 };
	        System.out.println("\nOriginal array: " + Arrays.toString(myArray2));
	        System.out.println("\nAfter sorting new array becomes: "
	                + Arrays.toString(sorty(myArray2)));

	    }
	    public static int[] sorty(int[] a){
	        int s = 0;
	        for (int i = 0; i < a.length-1; i++){
	            if (a[i] > a[i+1]) {
	                s = i;
	                break;
	            }
	        }
	        int e = 0;
	        for (int i = s+1; i < a.length-1; i++){
	            if (a[i] > a[i+1]) {
	                e = i;
	            }
	        }
	        int temp = a[s];
	        a[s] = a[e+1];
	        a[e+1] = temp;

	        return a;
	    }
	}

