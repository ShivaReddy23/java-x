import java.util.Scanner;
public class D12 { 
	    public static void main(String[] args) {          
	        Scanner sc = new Scanner(System.in);  
	            System.out.print("Result of comparing signed/unsigned numbers: ");     
	        Integer value = sc.nextInt();  
	        sc.close();  
	        System.out.println(value.compareTo(305));  
	        System.out.println(value.compareTo(200));  
	        System.out.println(value.compareTo(155));                 
	    }  
	 
}
