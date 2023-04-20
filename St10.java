import java.util.*;
public class S10 {
	public static void PrintStack(Stack<Integer> s)
	{
	    if (s.empty())
	        return;
	    int x = s.peek();
	    s.pop();
	    System.out.print(x + " ");
	    PrintStack(s);
	    s.push(x);
	}
	public static void main(String[] args)
	{
	    Stack<Integer> s = new Stack<Integer>();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    PrintStack(s);
	}
}
