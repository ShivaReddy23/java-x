import java.util.Scanner;
public class S7 {
	
	  private int[] arr;
	  private int top;
	  public  S7(int size) {
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
	  public int count() {
	    return top + 1;
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
	    S7 stack = new  S7(10);
	    System.out.println("\nInput some elements on the stack:");
	    stack.push(1);
	    stack.push(3);
	    stack.push(2);
	    stack.push(0);
	    stack.push(7);
	    stack.push(5);
	    stack.push(-1);
	    stack.display();
	    int ctr = stack.count();
	    System.out.println("\nNumber of elements in the said stack: " + ctr);
	  }
	}

