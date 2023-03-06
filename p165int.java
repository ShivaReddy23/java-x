import java.util.*;
public class p65int {
	    public static void move(int[] arr)
	    {
	        Arrays.sort(arr);
	    }
	    public static void main(String[] args)
	    {
	        int[] arr = { -2, 3, 4, -1, -3, 1, 2, -4, 0 };
	        move(arr);
	        for (int e : arr)
	            System.out.print(e + " ");
	    }
	}

