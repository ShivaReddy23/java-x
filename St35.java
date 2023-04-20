
public class St34 {
	 public static void main(String[] args) throws Exception {
	        String str = "successes";
	        System.out.println("The given string is: " + str);

	        int countFirstFreq = 0;
	        int countSecondFreq = 0;
	        char mostFrequent = '\"';
	        char secondMostFrequent = '\"';


	        for (int j = 0; j < str.length(); j++) {
	            int count = 0;
	            if (mostFrequent != str.charAt(j)){
	                for (int i = j; i < str.length(); i++) {
	                    if (str.charAt(j) == str.charAt(i))
	                        count++;
	                }
	            }
	            if (count > countFirstFreq) {
	                mostFrequent = str.charAt(j);
	                countFirstFreq = count;
	            }
	            else if (count > countSecondFreq ) {
	                secondMostFrequent = str.charAt(j);
	                countSecondFreq = count;
	            }
	        }
	        System.out.println("The second most frequent char in the string is: " + secondMostFrequent);
	    }
	}
