import java.util.Arrays;
public class A39 {
	public static void main(String[] args) {
		int[] array = {1,6,5,9,4,3,6,2};
		int[] newArray = {};
		for(int i =0; i< array.length -1; i++){
		for(int j =i+1; j< array.length; j++){
		if(array[i] >array[j]){
		continue;
		}else {
		array[i] = 0;
		break;
		}
		}
		}

		for(int i : array){
		if(i != 0)
		System.out.print(i + " ");
		}
		}		
}
