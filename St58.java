
public class St58 {
	public static void main(String[] args) throws Exception {
        String str1 = "string";
        String str2 = "strign";
        String s = "ng";
        String str = str1;
        for (int i = 0; i < 2; i++){
            System.out.println("The given strings is: " + str);
            boolean flog = false;
            if (str.substring(str.length() - 2).equals(s))
                flog = true;
            System.out.println("The string containing ng at last: " + flog);
            str = str2;
        }
    }
}
