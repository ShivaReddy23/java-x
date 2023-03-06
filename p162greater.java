public class p62greater {
	 static void printAboveAvg(int arr[], int n)
	    {
	        double avg = 0;
	        for (int i = 0; i < n; i++) 
	            avg += arr[i]; 
	        avg = avg / n;
	      
	        // Print elements greater than average
	        for (int i = 0; i < n; i++) 
	            if (arr[i] > avg) 
	                System.out.print(arr[i] + " ");
	    }
	  
	    // Driver program 
	    public static void main (String[] args)
	    {
	        int arr[] = {1, 4, 17, 7, 25, 3, 100};
	        int a = arr.length;
	        printAboveAvg(arr, a);
	      
	    }
	}
