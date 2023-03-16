import java.util.Arrays;
	import java.util.Scanner;
public class p231seq {
	    static void findMaxNum(int arr[], int n)
	    {
	        int[] hash = new int[10];
	        for (int i = 0; i < n; i++)
	            hash[arr[i]]++;
	 
	        for (int i = 9; i >= 0; i--)
	            for (int j = 0; j < hash[i]; j++)
	                System.out.print(i);
	    }
	    public static void main(String[] args)
	    {
	        int arr[] = { 5, 6, 7, 8, 9, 4, 3, 2, 1 };
	        int n = arr.length;
	        findMaxNum(arr, n);
	    	}
}
