import java.util.Scanner;
public class S18{
	  private int[] arr;
	  private int top;
	  public  S18(int size) {
	    arr = new int[size];
	    top = -1;
	  }
	  public void push(int num) {
	    if (top == arr.length - 1) {
	      System.out.println("Stack is full");
	    } else {
	      top++;
	      arr[top] = num;
	    }
	  }
	  public int pop() {
	    if (top == -1) {
	      System.out.println("Stack Underflow");
	      return -1;
	    } else {
	      int poppedElement = arr[top];
	      top--;
	      return poppedElement;
	    }
	  }
	  public int peek() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	      return -1;
	    } else {
	      return arr[top];
	    }
	  }
	  public boolean isEmpty() {
	    return top == -1;
	  }
	  public static S18 mergeStacks( S18 stack1,  S18 stack2) {
	    int size1 = stack1.top + 1;
	    int size2 = stack2.top + 1;
	    S18 mergedStack = new  S18(size1 + size2);
	    for (int i = 0; i < size1; i++) {
	      mergedStack.push(stack1.pop());
	    }
	    for (int i = 0; i < size2; i++) {
	      mergedStack.push(stack2.pop());
	    }

	    return mergedStack;
	  }
	  public void display() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	    } else {
	      System.out.print("Stack elements: ");
	      for (int i = top; i >= 0; i--) {
	        System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	    }
	  }

	  public static void main(String[] args) {
	    System.out.println("Initialize a stack:");
	    S18 stack1 = new  S18(5);
	    stack1.push(1);
	    stack1.push(2);
	    stack1.push(3);
	    System.out.println("\nStack-1");
	    stack1.display();
	    S18 stack2 = new  S18(5);
	    stack2.push(4);
	    stack2.push(5);
	    stack2.push(6);
	    System.out.println("\nStack-2");
	    stack2.display();
	    System.out.println("\nMerge said two stacks:");
	    S18 mergedStack = mergeStacks(stack1, stack2);
	    mergedStack.display();

	  }
     }