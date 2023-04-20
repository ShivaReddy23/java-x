
import java.util.Stack;

public class S20 {
	static boolean isSameStack(Stack<String> stack1,
            Stack<String> stack2)
{
boolean flag = true;
if (stack1.size() != stack2.size())
{
flag = false;
return flag;
}
while (stack1.empty() == false)
{
if (stack1.peek() == stack2.peek())
{
stack1.pop();
stack2.pop();
}
else
{
flag = false;
break;
}
}
return flag;
}
public static void main(String arr[])
{
Stack<String> stack1 = new Stack<String>();
Stack<String> stack2 = new Stack<String>();
stack1.push("1");
stack1.push("2");
stack1.push("3");
stack1.push("4");
stack1.push("5");
stack2.push("6");
stack2.push("7");
stack2.push("8");
stack2.push("2");
stack2.push("4");

if (isSameStack(stack1, stack2))
System.out.println("Stacks are Same");
else
System.out.println("Stacks are not Same");

}
}

