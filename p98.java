public class p98 {
	public static void main(String[] args)
	 {
		int[] a = {10, 20, 10, 20, 40, 13, 20};
			
		int c = 0, r=0;
	    
	    if(a.length >= 1 && a[0] == 20)
	        c++;

	    for(int i = 1; i < a.length; i++) {
	        if(a[i - 1] == 20 && a[i] == 20)
			{
	         System.out.printf( String.valueOf(false));	
	         r= 1;
			}                   
	        if(a[i] == 20)
	            c++;
	    }
	                                          
	    if (r==0)
	 	  {
	     	 System.out.printf( String.valueOf(c == 3));	         
		  }	
		  System.out.printf("\n");	
	    }
	}