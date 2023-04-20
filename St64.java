
public class St64 {
	public static void main(String[] args) throws Exception {
        String str = "educated";
        System.out.println("The given strings is: " + str);
        if (str.substring(0, 2).equals(str.substring(str.length()-2)))
            System.out.println(str.substring(2));
        else
            System.out.println(str);
    }
}
