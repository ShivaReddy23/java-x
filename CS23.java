import java.util.Scanner;
public class CS23 {
	public static void main(String[] strings) {
	Scanner in = new Scanner(System.in);
	System.out.print("please enter a numbers:");
	int number = in.nextInt();

	for (int i =1;i<=number;i++){
	for (int z =i;z>0;z--){

	System.out.print(" ");
	}
	for (int j =number;j>=i;j--){
	System.out.print("*");
	}
	System.out.print("\n");
	}
	}
	}

