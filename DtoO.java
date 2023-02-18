import java.util.Scanner;
public class DtoO {
	

	 
	    
	    static void decToOctal(int n)
	    {
	        
	        int[] octalno = new int[100];
	 
	       
	        int i = 0;
	        while (n != 0) {
	 
	            
	            octalno[i] = n % 8;
	            n = n / 8;
	            i++;
	        }
	 
	        
	        for (int j = i - 1; j >= 0; j--)
	            System.out.print(octalno[j]);
	    }
	 
	    public static void main(String[] args)
	    {
	       
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	 
	        decToOctal(n);
	    }
	
}
