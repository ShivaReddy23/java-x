import java.io.*;
public class p29num {
	
	  static int findSingle(int A[], int ar_size)
	  {
	  
	    // Iterate over every element
	    for (int i = 0; i < ar_size; i++) {
	  
	      // Initialize count to 0
	      int count = 0;
	  
	      for (int j = 0; j < ar_size; j++) {
	  
	        if (A[i] == A[j]) {
	          count++;
	        }
	      }
	  
	      if (count == 1) {
	        return A[i];
	      }
	    }
	  
	    return -1;
	  }
	  
	  public static void main (String[] args) {
	    int ar[] = { 10, 20, 10, 20, 30, 40, 40, 30, 50};
	    int n = ar.length;
	  
	    // Function call
	    System.out.println("Element occurring once is " + findSingle(ar, n));
	  }
	}
	  
