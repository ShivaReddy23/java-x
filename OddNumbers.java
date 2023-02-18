import java.util.Scanner;
public class OddNumbers {
	public static void main(String[] args)   
	{  
	int number, i;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	number = sc.nextInt();    
	i=1;   
	System.out.print("Lit of odd numbers: ");   
	while(i<=number)  
	{  

	System.out.print(i +" ");   
 
	i=i+2;  
	}     
	}  
	
}