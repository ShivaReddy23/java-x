import java.util.Scanner;

	public class HtoO
	{
	   public static void main(String[] args)
	   {
	      int d=0, r, i=0;
	      int[] o = new int[20];
	      
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Hexadecimal Number: ");
	      String hexadecimal = s.nextLine();
	      
	      int len = hexadecimal.length();
	      
	      for(len=(len-1); len>=0; len--)
	      {
	         r = hexadecimal.charAt(len);
	         if(r>='0' && r<='9')
	            r = r-48;
	         else if(r>='A' && r<='F')
	            r = r-55;
	         else if(r>='a' && r<='f')
	            r = r-87;
	         else
	         {
	            System.out.println("\nInvalid Hexadecimal Digit!");
	            return;
	         }
	         int m=1;
	         for(int k=1; k<=i; k++)
	            m *= 16;
	         d = (int) (d + (r*m));
	         i++;
	      }
	      
	      for(i=0; d!=0; d /= 8)
	         o[i++] = d%8;
	      
	      System.out.print("\nEquivalent Octal Value = ");
	      for(i=(i-1); i>=0; i--)
	         System.out.print(o[i]);
	   }
	
}
