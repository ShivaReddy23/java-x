import java.util.Scanner;
public class DtoHex {
	
	   public static void main(String[] args)
	   { 
	      int decimal, rem;
	      String hexadecimal="";
	      char[] hexDigit = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Decimal No: ");
	      decimal = scan.nextInt();
	      
	      while(decimal>0)
	      {
	         rem = decimal%16;
	         hexadecimal = hexDigit[rem] + hexadecimal;
	         decimal = decimal/16;
	      }
	      
	      System.out.print("Hexadecimal Value = " +hexadecimal);
	   }
	}
