
public class St43 {
	public static void main(String[] args) throws Exception {
        String str = "test string";
        System.out.println("The given string is: " + str);

        int charCount = 0;
        char mOC = ' ';
        for (int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (charCount < count) {
                charCount = count;
                mOC = str.charAt(i);
            }
        }
        System.out.println("Max occurring character in the given string is: " + mOC);
    }
}
