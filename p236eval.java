import java.util.Arrays;
public class p236val {
	public static void main(String[] args) {

	String str="5 apple and 10 orange are rotten in the basket";
	System.out.println("String: "+str);
	String[] arr=str.split(" ");
	Arrays.sort(arr);
	int num1=Integer.parseInt(arr[0]),num2=Integer.parseInt(arr[1]),result=num1+num2;
	System.out.println("Sum of the numeric values: "+result);
	}
	}

