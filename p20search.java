import java.util.Scanner;
public class p20search {
	public static void main(String[] args)
	{
	int [][] arr = {{1,2,3},{4,5,6}, {7,8,9}};

	Scanner sc = new Scanner(System.in);
	for(int row = 0 ; row < 3 ; row++)
	{
	for(int column = 0 ; column < 3 ; column++)
	{
	System.out.print(arr[row][column]);
	}
	System.out.println();
	}

	System.out.println("Enter a number to be found");
	int a = sc.nextInt();

	boolean found = true;

	for(int row = 0 ; row < 3 ; row++)
	{
	for(int column = 0 ; column < 3 ; column++)
	{
	if(arr[row][column] == a)
	{

	System.out.println("The number " + arr[row][column] + " is found in the matrix ");

	}
	}}}}