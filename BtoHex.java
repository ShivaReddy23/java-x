import java.io.*;
import java.util.Scanner;
class BtoHex{
 
    
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
	String decimalToHex(long binary)
    {
        
        int decimalno = binaryToDecimal(binary);
 
        String hexno
            = Integer.toHexString(decimalno);
 
        
        hexno = hexno.toUpperCase();
 
       return hexno;
    }
	public static void main(String[] args)
    {
		BtoHex ob = new BtoHex();
		Scanner sc=new Scanner(System.in);
		 long num = sc.nextLong();  
        
		System.out.println("Inputted number : " +num);
        System.out.println(ob.decimalToHex(num));
    }
}