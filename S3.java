import java.util.Scanner;
public class S3 {
	  private int[] arr;
	  private int top;
	  public S3 (int size) {
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

	  public void sort() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	      return;
	    }

	    S3  tempStack = new S3 (arr.length);

	    while (!isEmpty()) {
	      int temp = pop();

	      while (!tempStack.isEmpty() && tempStack.peek() < temp) {
	        push(tempStack.pop());
	      }

	      tempStack.push(temp);
	    }

	    while (!tempStack.isEmpty()) {
	      int temp = tempStack.pop();
	      push(temp);
	    }
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
	    S3 stack = new S3 (6);
	    System.out.println("\nInput some elements on the stack:");
	    stack.push(1);
	    stack.push(3);
	    stack.push(2);
	    stack.push(0);
	    stack.push(7);
	    stack.push(5);
	    stack.display();
	    System.out.println("\nSort the elements of the stack in descending order:");
	    stack.sort();
	    stack.display();
	  }
	}

