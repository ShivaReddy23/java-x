import java.util.*;
public class N29 {
	 public static boolean isLucky(int n) {
	    boolean temp[]=new boolean[10]; 
	        for (int i = 0; i < 10; i++) 
	            temp[i] = false; 
	        while (n > 0) 
	        { 
	            int digit = n % 10;       
	            if (temp[digit]) 
	            return false;       
	            temp[digit] = true;            
				n = n / 10; 
	        } 
	        return true; 
	 }	

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input an integer: ");
			String input = scanner.nextLine();
			int number = Integer.parseInt(input); 
			System.out.println("Is Lucky number? "+isLucky(number));		
			}
}
