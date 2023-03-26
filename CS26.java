import java.util.Scanner;
public class CS26 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Input number of rows: ");
	        int rows = input.nextInt();

	        int r = rows * 2 - 1;
	        int begin = rows-1;
	        int end = rows-1;
	        int num = 0;

	        for (int i = 0; i < r; i++){

	            num = 0;
	            for (int j = 0; j < r; j++) {
	                if (begin <= j && j <= end) {
	                    System.out.print((char) (65+num));
	                    if (j < rows-1)
	                        num++;
	                    else
	                        num--;
	                } else
	                    System.out.print(" ");


	            }
	            System.out.println();

	            if (i < rows-1){
	                begin--;
	                end++;
	            } else {
	                begin++;
	                end--;
	            }


	        }


	    }
	}

