import java.util.Arrays;
public class A2 {
	public static void main(String[] args) {
	int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sum=Arrays.stream(my_array).sum();
	System.out.println("The sum is " + sum);
	}
	}

