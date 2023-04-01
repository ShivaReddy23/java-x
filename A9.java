import java.util.Arrays;
import java.util.Scanner;
public class A9 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element: ");
		int element=sc.nextInt();
		System.out.println("Enter index: ");
		int index=sc.nextInt();
		int[] arr={1,2,3,4,5,6,7};
		arr[index]=element;
		System.out.println(Arrays.toString(arr));
		}
		}
