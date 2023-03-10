import java.io.*;
import java.util.Scanner;
public class p33path {
	
	    static int numberOfPaths(int m, int n)
	    {
	        // Create a 1D array to store results of subproblems
	        int[] dp = new int[n];
	        dp[0] = 1;
	 
	        for (int i = 0; i < m; i++) {
	            for (int j = 1; j < n; j++) {
	                dp[j] += dp[j - 1];
	            }
	        }
	 
	        return dp[n - 1];
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	        System.out.println(numberOfPaths(5, 3));
	    }
	}