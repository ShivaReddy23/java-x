
public class St65 {
	public static void main(String[] args) throws Exception {
        String str = "platinum";
        System.out.println("The given strings is: " + str);
        String s = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 't' && (i == 0 || i == str.length()-1)) continue;
            s += str.charAt(i);
        }}
}