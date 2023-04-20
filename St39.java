
public class St38 {
	public static void main(String[] args) throws Exception {
        String str = "shivani";
        System.out.println("The given string is: " + str);
        String result = "";

        for (int i = 0; i < str.length(); i++){
            String temp = str.charAt(i)+"";
            if ( !(result.contains(temp)) )
                result += temp;
        }

        System.out.println("After removing duplicates characters the new string is: " + result);
    }
}
