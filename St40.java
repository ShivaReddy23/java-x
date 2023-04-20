
public class St39 {
	 public static void main(String[] args) throws Exception {
	        String str = "shivani";
	        System.out.println("The given string is: " + str);

	        for (int i = 0; i < str.length(); i++){
	            int count = 0;
	            for (int j = 0; j < str.length(); j++){
	                if (str.charAt(i) == str.charAt(j))
	                    count++;
	            }
	            if (count == 1){
	                System.out.println("The first non repeated character in String is: "
	                                   + str.charAt(i));
	                break;
	            }
	        }
	    }
}
