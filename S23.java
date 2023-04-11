import java.util.Arrays;
public class S23 { 
	int s;  
	int t1, t2;  
	int a[];   
	S23(int size)  
	{  
	a = new int[size];  
	this.s = size;  
	t1 = -1;  
	t2 = size;  
	}   
	void push1(int i)  
	{   
	if (t1 < t2 - 1)   
	{  
	t1 = t1 + 1;  
	a[t1] = i;  
	}  
	else   
	{  
	System.out.println("Overflow of the Stack");  
	System.exit(1);  
	}  
	}
	void push2(int i)  
	{   
	if (t1 < t2 - 1)   
	{  
	t2 = t2 - 1;  
	a[t2] = i;  
	}  
	else   
	{  
	System.out.println("Overflow of the Stack");  
	System.exit(1);  
	}  
	}   
	int pop1()  
	{  
	if (t1 >= 0)   
	{  
	int i = a[t1];  
	t1 = t1 - 1;  
	return i;  
	}  
	else   
	{  
	System.out.println("Overflow of the Stack");  
	System.exit(1);  
	}  
	return 0;  
	}   
	int pop2()  
	{  
	if (t2 < s)   
	{  
	int i = a[t2];  
	t2 = t2 + 1;  
	return i;  
	}  
	else   
	{  
	System.out.println("Overflow of the Stack");  
	System.exit(1);  
	}  
	return 0;  
	}    
	public static void main(String args[])  
	{  
		S23 ts = new S23(5);  
	ts.push1(50);  
	ts.push2(101);  
	ts.push2(150);  
	ts.push1(191);  
	ts.push2(17);  
	System.out.println("The popped element from the stack 1 is: " + ts.pop1());    
	ts.push2(40);  
	System.out.println("The popped element from the stack 2 is: " + ts.pop2());  
	}  
	}
