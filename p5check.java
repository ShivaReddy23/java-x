import java.io.*;
	import java.util.*;
public class p5check {
	public static void main(String[]args)

	{
		Scanner sc = new Scanner(System.in);

		int [] arr = {1, 5, 3, 0, 5, 0, 1, 5,};
		boolean check = false;

		for(int i = 0 ; i < arr.length/2 ; i++)
		{
		for(int j = arr.length-1 ; j >= arr.length/2 ; j--)
		{
		if(arr[i] == arr[j])
		{
		System.out.println(arr[i] + " " + arr[j]);
		check = true;
		}
		}
		}
		System.out.println(check);
		}
		}