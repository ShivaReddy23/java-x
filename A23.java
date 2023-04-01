import java.util.*;
public class A23 {
	public static void main(String[] args) {

	int[] my_array1 = {1,2,3,4,5,6,7};
	int[] my_array2 = {1,2,3,4,5,6,7};
	int[] my_array3=new int[my_array1.length];

	int count=0;

	for (int i=1; i<= my_array1.length-1;i++){
	for (int j=1; j<= my_array2.length-1;j++){

	if ((my_array1[i]==my_array2[j])&&(i==j))
	count++;
	}
	}
	if ((count== my_array1.length-1) && (my_array1.length== my_array2.length))
	System.out.println("The two arrays are equal");
	else

	System.out.println("The two arrays are NOT equal");

	}
	}
