import java.util.*;
public class S6 {
	 public static void main(String args[])
	    {
	        Stack<String> stack = new Stack<String>();
	        stack.add("1");
	        stack.add("3");
	        stack.add("2");
	        stack.add("0");
	        stack.add("7");
	        System.out.println("Stack: " + stack);
	        Stack<String> colstack = new Stack<String>();
	        colstack.add("5");
	        colstack.add("-1");
	        colstack.add("2");
	        boolean changed = stack.removeAll(colstack);
	        if (changed)
	            System.out.println("Collection removed");
	        else
	            System.out.println("Collection not removed");
	        System.out.println("Final Stack: " + stack);
	    }
	}

