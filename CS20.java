import java.util.Scanner;
public class Cs20 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int rows = in.nextInt(); in.nextLine();
		int previousN, nextN;
		for(int r = 0; r < rows; r++){
		previousN = ((r + 1) % 2) != 0 ? 0 : 1;
		for(int c = 0; c <= r; c++){
		nextN = previousN == 0 ? 1 : 0;
		previousN = nextN;
		System.out.print(nextN);
		}
		System.out.println();
		}
		}}