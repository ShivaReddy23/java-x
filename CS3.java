import java.util.*;
public class CS3 {
	public static void main(String[] args) {
	int n1, n2, n3;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 3 numbers:");
	n1 = in.nextInt();
	n2 = in.nextInt();
	n3 = in.nextInt();
	if(n1>n2 && n1>n3)
	System.out.println("Max number is: " + n1);
	else if(n2>n3)
	System.out.println("Max number is: " + n2);
	else
	System.out.println("max number is: " + n3);
	}

	}

