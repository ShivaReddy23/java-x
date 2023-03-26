import java.util.Scanner;
public class CS18 {
	public static void main(String[] strings) {
	Scanner in = new Scanner(System.in);
	System.out.print("please enter a numbers:");
	int number = in.nextInt();
	int i=0;
	int j=1;
	int q=1;
	for ( i =1 ;i<=number;i++){
	for ( j =1 ;j<=i;j++){
	System.out.print(q+" ");
	q++;
	}

	System.out.print("\n");
	}
	}
	}

