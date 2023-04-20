import java.util.*;
public class St1 {
	public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Input the string: ");
	String x=in.nextLine();
	System.out.print("How many elements would you like to search?(max 10) ");
	int y=in.nextInt();
	for(int i=0;i<=y-1;i++) {
	System.out.println("----------");
	System.out.println("This is search number "+(i+1));
	System.out.print("Wich element would you like to search? ");
	int z=in.nextInt();
	System.out.println("The element with number "+z+" is "+x.charAt(z-1));
	}
	}
}
