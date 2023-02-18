import java.util.*; 
import java.io.*; 
public class p100 {
	 public static void main(String[] args)
	 {
		int[] a1 = {10, 11, 10, 20, 43, 20, 50};
		int[] a2 = {10, 13, 11, 20, 44, 30, 50};
		System.out.println("A1: "+Arrays.toString(a1)); 
		System.out.println("A2: "+Arrays.toString(a2)); 
		int ctr = 0;
	    
	    for(int i = 0; i < a1.length; i++) {
	        if(Math.abs(a1[i] - a2[i]) <= 1 && a1[i] != a2[i])
	            ctr++;
	    }
	                    
	    System.out.printf("Number of elements: "+ctr);
		System.out.printf("\n");	 
	  }
	}
