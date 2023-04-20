
public class St99 {
	public static void main(String[] args) throws Exception {
        String str = "w3resource.com";
        System.out.println("The given string is: " + str);

       int len = str.length();
       String s = "";
        for (int i = 0; i < len; i++){
           if (i % 2 == 0)
               s += str.charAt(i);
        }
        System.out.println("The new string is: " + s);
    }
}
