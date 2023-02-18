import java.util.Scanner;

public class Module {
	public static void main(String args[])  
    { 
        Scanner a = new Scanner(System.in); 
 
        int x, y, z; 
 
        System.out.print("Enter first integer: "); 
 
        x = a.nextInt(); 
 
        System.out.print("Enter second integer: "); 
 
        y = a.nextInt(); 
 
        z = x % y; 
 
        System.out.println("The modulus of x and y is: " + z); 
 
    }  
 

}