import java.util.Scanner;
public class A19 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Input number of rows of matrix: ");
	        int rows = input.nextInt();
	        System.out.print("Input number of columns of matrix: ");
	        int columns = input.nextInt();
	        int[][] firstMatrix = new int[rows][columns];
	        int[][] secondMatrix = new int[rows][columns];
	        System.out.println("Input elements of first matrix: ");
	        for (int i = 0; i < rows; i++){
	            for (int j = 0; j < columns; j++){
	                firstMatrix[i][j] = input.nextInt();
	            }
	        }
	        System.out.println("Input elements of second matrix: ");
	        for (int i = 0; i < rows; i++){
	            for (int j = 0; j < columns; j++){
	                secondMatrix[i][j] = input.nextInt();
	            }
	        }
	        System.out.println("Sum of the matrices:-");
	        int sum = 0;
	        for (int i = 0; i < rows; i++){
	            for (int j = 0; j < columns; j++){
	                sum = secondMatrix[i][j] + firstMatrix[i][j];
	                System.out.print(sum + "\t\t");
	            }
	            System.out.println();
	        }

	    }
	}
