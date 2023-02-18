import java.util.Scanner;

public class HtoD {
	   public static int hex_to_decimal(String s)
	    {
	             String digits = "0123456789ABCDEF";
	             s = s.toUpperCase();
	             int val = 0;
	             for (int i = 0; i < s.length(); i++)
	             {
	                 char c = s.charAt(i);
	                 int d = digits.indexOf(c);
	                 val = 16*val + d;
	             }
	             return val;
	    }
	    public static void main(String args[])
	    {
	        String hexdecno;
	        int decno;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter a hexadecimal number: ");
	        hexdecno = scan.nextLine();
			
	        decno = hex_to_decimal(hexdecno);
			
	        System.out.print("Equivalent decimal number is: " + decno+"\n");
	    }
	
}
