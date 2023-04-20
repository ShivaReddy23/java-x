import java.util.Arrays;
public class St104 {
	public static void main(String[] args) {
		String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue",
		"Champagne", "Indigo", "Ivory"};
		System.out.println("Unsorted Array: "+Arrays.toString(colors));
		Arrays.sort(colors);
		System.out.println("Sorted Array: "+Arrays.toString(colors));
		System.out.print("Descending order: {");
		for(int i=colors.length-1;i>=0;i--)
		System.out.print(colors[i]+", ");
		System.out.println("}");
		}
}
