import java.util.Stack;
public class S27 {
	  public static void main(String[] args) {
	    Stack<String> numbers= new Stack<>();
	    numbers.push("1");
	    numbers.push("2");
	    numbers.push("3");
	    System.out.println("Stack: " + numbers);
	    numbers.pop();
	    System.out.println("Stack after pop: " + numbers);
	    }
	}

