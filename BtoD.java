import java.util.Scanner;
public class BtoD {
	

	    static int binaryToDecimal(int n)
	    {
	        int num = n;
	        int decno = 0;
	 
	        
	        int base = 1;
	 
	        int temp = num;
	        while (temp > 0) {
	            int lastno = temp % 10;
	            temp = temp / 10;
	 
	            decno += lastno * base;
	 
	            base = base * 2;
	        }
	 
	        return decno;
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
			Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        
	        System.out.println(binaryToDecimal(num));
	    }
	}
	 

