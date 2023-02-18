import java.util.*;
public class p93 {
	 public static void main(String[] args)
	 {
	    
		int[] n = {10, 10, 2, 4, 20, 20};  
		int even = 0, odd = 0;
		System.out.println("Original Array: "+Arrays.toString(n)); 
		    
	    boolean found1010 = false;
	    boolean found2020 = false;
	      
	    for(int i = 0; i < n.length - 1; i++) {
	        if(n[i] == 10 && n[i+1] == 10)
	            found1010 = true;
	                        
	        if(n[i] == 20 && n[i+1] == 20)
	            found2020 = true;
	    }
	   
		System.out.printf( String.valueOf(found1010 != found2020));	
		System.out.printf("\n");
	  }
	}