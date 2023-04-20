
public class St76 {
	 public static void main(String[] args) throws Exception {
	        String str = "liveonwildlife";
	        System.out.println("The given string is: " + str);

	        int count = 0;
	        for (int i = 3; i < str.length(); i++){
	            if (str.charAt(i-3) == 'l' &&
	                    str.charAt(i-2) == 'i' &&
	                    str.charAt(i) == 'e')
	                count++;
	        }
	        System.out.println("The substring life or li?e appear number of times: " + count);
	    }
}
