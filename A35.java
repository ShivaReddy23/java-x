import java.util.Arrays;
public class A35 {
	public static void check(int[] arr,int num)
	{
	for(int i = 0;i < arr.length ;i++)
	{
	for(int x = 0;x < arr.length ;x++)
	{
	if(arr[i] + arr[x] == num && arr[i] <= arr[x] && i != x)
	{
	System.out.println("Index 1 : "+arr[i]+" Index 2 : "+arr[x]);

	}
	}
	}
	}

	public static void main(String[] args)
	{
	int[] arr = {1,2,3,4,5,6};
	Arrays.sort(arr);
	check(arr,6);
	}
	}

