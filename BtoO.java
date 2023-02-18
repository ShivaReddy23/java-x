import java.util.Scanner;
public class BtoO {
	    int binaryToDecimal(long binary)
	    {
			int decimalno = 0, i = 0;
	        while (binary > 0) {
	 
	            decimalno
	                += Math.pow(2, i++) * (binary % 10);
	 
	            binary /= 10;
	        }
	        return decimalno;
	    }
	    int decimalToOctal(long binary)
	    {
	 
	        int decimalno = binaryToDecimal(binary);
	 
	        String octalString
	            = Integer.toOctalString(decimalno);
	 
	        int octalno = Integer.parseInt(octalString);
	 
	        return octalno;
	    }
	 
	    public static void main(String[] args)
	    {

	        BtoO ob = new BtoO();
			Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
	        System.out.println("octal number:"+ob.decimalToOctal(num));
	    }
	
}
