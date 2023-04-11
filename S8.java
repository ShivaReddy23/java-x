import java.util.*;
public class S8 {
	    public static void main(String args[])
	    {
	        Stack<Integer> stack = new Stack<Integer>();
	        stack.add(10);
	        stack.add(15);
	        stack.add(30);
	        stack.add(20);
	        stack.add(5);
	        System.out.println("Stack: " + stack);
	        System.out.println("Does the Stack contains 'Geeks'? "
	                           + stack.contains("Geeks"));
	        System.out.println("Does the Stack contains '4'? "
	                           + stack.contains("4"));
	        System.out.println("Does the Stack contains 'No'? "
	                           + stack.contains("No"));
	    }
	}
