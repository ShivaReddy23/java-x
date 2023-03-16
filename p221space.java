import java.util.Arrays;
	import java.util.Scanner;
public class p221space {
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int[] arr=new int[6];
	System.out.print("Input a number: ");
	for(int i=0;i<6;i++) {
	int x= input.nextInt();
	arr[i]=x;
	}
	Arrays.sort(arr);
	System.out.print("After sorting the said integers: \n");
	for(int i=arr.length-1;i>-1;i--)
	System.out.print(arr[i]+" ");
	}
	}

