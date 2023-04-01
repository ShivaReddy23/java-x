import java.util.Arrays;
public class A58 {
	    public static void main(String[] args) throws Exception {
	        int[] A = {1, 5, 6, 7, 8, 10};
	        int[] B = {2, 4, 9};
	        System.out.println("Original array:");
	        System.out.println("A: " + Arrays.toString(A)
	                           + "\nB: " + Arrays.toString(B) + "\n");

	        int[] M = new int[A.length + B.length];
	        int j = 0;
	        for (int i = 0; i < M.length; i++){
	            if (i < A.length)
	                M[i] = A[i];
	            else
	                M[i] = B[j++];
	        }
	        Arrays.sort(M);
	        System.out.println(Arrays.toString(M));

	        int k = 0;
	        for (int i = 0; i < M.length; i++){
	            if (i < A.length)
	                A[i] = M[i];
	            else
	                B[k++] = M[i];
	        }

	        System.out.println("Sorted Arrays:");
	        System.out.println("A: " + Arrays.toString(A)
	                + "\nB: " + Arrays.toString(B));
	    }

	}

