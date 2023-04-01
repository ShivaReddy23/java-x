import java.util.Scanner;
	import java.util.Arrays;
public class A79 {
	  public static void main(String[] args) {
	    String[] str_arra = {"A", "B", "D", "E"};
	    System.out.printf("Original array of elements:\n" + Arrays.toString(str_arra));
	    String result = test(str_arra);
	    System.out.printf("\nMissing letter in the said array: " + result);
	  }
	  public static String test(String[] str_arra) {
	    for (int i = 0; i < str_arra.length-1; i++) {
				if (str_arra[i+1].charAt(0) - str_arra[i].charAt(0) > 1) {
				String result_char = "" +	(char)((int)str_arra[i].charAt(0)+1);
				return result_char;
				}
			}
			return "";
	   }
	}

