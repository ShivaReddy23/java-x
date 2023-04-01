import java.util.Arrays;
public class A36 {
	    public static void main(String[] args) throws Exception {
	        int[] input = {1, -2, 0, 5, -1, -4};
	        int target = 2;

	        String result = "[";
	        for (int i = 0; i < input.length; i++){
	            int[] tempArray = new int[3];
	            for (int j = i+1; j < input.length; j++){
	                for (int k = j+1; k < input.length; k++){
	                    if (input[i] + input[j] + input[k] == target){
	                        tempArray[0] = input[i];
	                        tempArray[1] = input[j];
	                        tempArray[2] = input[k];
	                        result += Arrays.toString(tempArray) + ", ";
	                    }
	                }
	            }}
	        System.out.println(result.substring(0, result.length()-2) + "]");
	    }
	}

