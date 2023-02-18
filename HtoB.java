import java.util.Scanner;
public class HtoB {

	    String decimalToBinary(int d)
	    {
	 
	 
	        String b = "";
	 
	        while (d != 0) {
	 
	            b = (d % 2) + b;
	 
	            d /= 2;
	        }
	        while(b.length() % 4 != 0) {
	            
	            b = "0" + b;
	        }
	        return b;
	    }
	    String hexToBinary(String hexadecimal)
	    {
	        int i;
	        char ch;
	        String binary = "";
	        int returnedBinary;
	 
	        hexadecimal = hexadecimal.toUpperCase();
	 
	        for (i = 0; i < hexadecimal.length(); i++) {
	 
	            ch = hexadecimal.charAt(i);
	 
	            if (Character.isDigit(ch) == false
	                && ((int)ch >= 65 && (int)ch <= 70)
	                       == false) {
	 
	                binary = "Invalid Hexadecimal String";
	                return binary;
	            }
	            else if ((int)ch >= 65 && (int)ch <= 70)
	 
	                returnedBinary = (int)ch - 55;
	            else
	                returnedBinary
	                    = Integer.parseInt(String.valueOf(ch));
	 
	            binary += decimalToBinary(returnedBinary);
	        }
	        return binary;
	    }
	    public static void main(String[] args)
	    {

	        HtoB ob = new HtoB();
	        Scanner sc = new Scanner(System.in);
	        String hex = sc.nextLine();;
	       
	       // System.out.println(hex);
	       
	        System.out.println(ob.hexToBinary(hex));
	    }
	
}
