import java.util.*;
public class p67move {
	
	    public static void main(String[] args)
	    {
	        int[] A = { 0, 3, 4, 0, 1, 2, 5, 0 };
	        int n = A.length;
	        int j = 0;
	        for (int i = 0; i < n; i++) {
	            if (A[i] != 0) {
	              
	                swap(A, j, i); 
	                j++;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(A[i] + " "); // Print the array
	        }
	    }
	    public static void swap(int[] A, int a, int b)
	    {
	        int temp = A[a];
	        A[a] = A[b];
	        A[b] = temp;
	    }
	}