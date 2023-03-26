import java.util.Scanner;
public class CS24 {
	public static void main(String[] strings) {
	Scanner in = new Scanner(System.in);
	System.out.print("please enter a numbers:");
	int number = in.nextInt();
	for (int i =1;i<=number;i++){
	for (int z =i;z<=number;z++){

	System.out.print(" ");
	}
	for (int j =i;j>0;j--){
	System.out.print("@");
	}
	System.out.print("\n");
	}
	}
	}

