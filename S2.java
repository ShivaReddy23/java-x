import java.util.Stack;
public class S2 {
		    public static Stack<Integer> sortstack(Stack<Integer>
		                                             input)
		    {
		        Stack<Integer> tmpStack = new Stack<Integer>();
		        while(!input.isEmpty())
		        {
		            int tmp = input.pop();
		            while(!tmpStack.isEmpty() && tmpStack.peek()
		                                                 > tmp)
		            {
		            input.push(tmpStack.pop());
		            }
		            tmpStack.push(tmp);
		        }
		        return tmpStack;
		    }
	public static void main(String args[])
	{
	    Stack<Integer> input = new Stack<Integer>();
	    input.add(1);
	    input.add(3);
	    input.add(2);
	    input.add(0);
	    input.add(7);
	    input.add(5);
	    Stack<Integer> tmpStack=sortstack(input);
	    System.out.println("Sorted numbers are:");
	 
	    while (!tmpStack.empty())
	    {
	        System.out.print(tmpStack.pop()+" ");
	    }
	}
	}
