
public class A43 {
	public static void main(String[] args) throws Exception {
        int nums[] = {10, 20, 30, 40, 1, 2};
        int givenValue = 53;

        System.out.println("Given value: " + givenValue);
        System.out.println("Combination of four elements:");
        for (int i = 0; i < nums.length-3; i++){
            for (int j = i+1; j < nums.length-2; j++){
                for (int k = j+1; k < nums.length-1; k++){
                    for (int l = k+1; l < nums.length; l++){
                        if (nums[i] + nums[j] + nums[k] +nums[l] == givenValue){
                            System.out.println(nums[i] +" "+ nums[j] +" "+ nums[k] +" "+ nums[l]);
                        }
                    }
                }} }  }
}
