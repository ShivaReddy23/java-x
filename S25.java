import java.util.Stack;
public class S25 { 
	public static void main(String[] args)   
	{   
	Stack<Integer> stk= new Stack<>();  
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);    
	stk.push(1);  
	stk.push(2);  
	stk.push(3);  
	stk.push(4);    
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	}  
	}  

