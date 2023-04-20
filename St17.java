import java.util.Scanner;
public class S17 {
	  private int[] arr;
	  private int top;
	  public S17(int size) {
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

	  public void moveNthElementToTop(int n) {
	    if (n < 1 || n > top + 1) {
	      System.out.println("Invalid index");
	    } else {
	      int element = arr[top - n + 1];
	      for (int i = top - n + 1; i < top; i++) {
	        arr[i] = arr[i + 1];
	      }
	      arr[top] = element;
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
	    S17 stack = new S17(5);
	    System.out.println("Input some elements on the stack:");
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
	    stack.push(5);
	    stack.display();
	    int n = 2;
	    System.out.println("\nMove the nth element from the top of the stack to the top, n = " + n);
	    stack.moveNthElementToTop(n);
	    stack.display();
	    n = 3;
	    System.out.println("\nMove the nth element from the top of the stack to the top, n = " + n);
	    stack.moveNthElementToTop(n);
	    stack.display();
	    n = 3;
	    System.out.println("\nMove the nth element from the top of the stack to the top, n = " + n);
	    stack.moveNthElementToTop(n);
	    stack.display();
	  }
	}
