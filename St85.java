public class St85 {
	public static void main(String[] args) throws Exception {
        String str1 = "weablcoabmeab";
        String str2 = "ab";
        System.out.println("The given string are: " + str1 + " and " + str2);
        String s = "";
        int len = str1.length();
        for (int i = 0; i < len; i++){
            if (i+2 <= len){
                if (str1.substring(i, i + 2).equals(str2)) {
                    if (i != 0)
                        s += str1.charAt(i - 1);
                    if (i + 2 < len) {
                        s += str1.charAt(i + 2);
                    }
                }
            }
        }
        System.out.println("The new string is: " + s);
    }
}
