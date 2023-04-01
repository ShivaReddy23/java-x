import java.util.Arrays;
public class A63 {
	    public static void main(String[] args) throws Exception {
	        int[] myArray1 = {1, 2, 3, 4, 5, 6, 7};
	        System.out.println("Original array:\n" + Arrays.toString(myArray1));
	        System.out.println(Arrays.toString(replaceWithProd(myArray1)));
	        System.out.println();

	        int[] myArray2 = {0, 1, 2, 3, 4, 5, 6, 7};
	        System.out.println("Original array:\n" + Arrays.toString(myArray2));
	        System.out.println(Arrays.toString(replaceWithProd(myArray2)));
	    }
	    public static int[] replaceWithProd(int[] arr){
	        int[] newArr = new int[arr.length];
	        for (int i = 0; i < arr.length; i++){
	            int prod = 1;
	            for (int j = 0; j < arr.length; j++){
	                if (i != j)
	                    prod *= arr[j];
	            }
	            newArr[i] = prod;
	        }
	        return newArr;
	    }
	}

