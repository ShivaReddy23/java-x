
public class St46 {
	public static void main(String[] args) throws Exception {
        String str = "This is a test string";
        System.out.println(str);
        String[] strArray = str.split(" ");

        String result = "";
        for (int j = 0; j < strArray.length; j++){
            String s = "";
            String sr = strArray[j];
            for (int i = 0; i < sr.length(); i++){
                s = sr.charAt(i) + s;
            }
            if (j != strArray.length-1)
                result += s + " ";
            else
                result += s;
        }
        System.out.println("The string reversed word by word is:\n" + result);
    }
}
