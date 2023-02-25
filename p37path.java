import java.io.*;
	import java.util.*;
public class p37path {
	
	  static int UniquePathHelper(int i, int j, int r, int c,
	                              int[][] A)
	  {
	    if (i == r || j == c) {
	      return 0;
	    }
	 
	    if (A[i][j] == 1) {
	      return 0;
	    }
	    if (i == r - 1 && j == c - 1) {
	      return 1;
	    }
	 
	    return UniquePathHelper(i + 1, j, r, c, A)
	      + UniquePathHelper(i, j + 1, r, c, A);
	  }
	 
	  static int uniquePathsWithObstacles(int[][] A)
	  {
	 
	    int r = A.length, c = A[0].length;
	 
	    return UniquePathHelper(0, 0, r, c, A);
	  }
	  public static void main(String[] args)
	  {
	    int[][] A
	      = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
	 
	    System.out.print(uniquePathsWithObstacles(A));
	  }	}
