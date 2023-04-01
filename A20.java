import java.util.List;
	import java.util.ArrayList;
	import java.util.Arrays;
public class A20 {
	static{System.out.println("Original: Program converts an array to an ArrayList!");};

	private static void printArray(String[] array) {
	System.out.print("Array: ");
	for(int i = 0; i < array.length; i++) {
	System.out.print(array[i]);
	}
	System.out.println();
	}

	private static void printArrayList(List list) {
	System.out.print("ArrayList: ");
	for(int i = 0; i < list.size(); i++) {
	System.out.print(list.get(i));
	}
	System.out.println();
	}

	public static void main(String[] args) {
	String[] array = new String[4];
	array[0] = "Program ";
	array[1] = "converts ";
	array[2] = "an array ";
	array[3] = "to an ArrayList!";

	List list = Arrays.asList(array);

	printArray(array);
	printArrayList(list);
	}}