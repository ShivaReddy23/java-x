
public class St98 {
	public static void main(String[] args) throws Exception {
        String str = "fizzez";
        System.out.println("The given string is: " + str);

       int len = str.length();
       boolean flog = false;
        for (int i = 1; i < len; i++){
           if (str.charAt(i-1) == 'z'){
               if (str.charAt(i) == 'z') {
                   flog = true;
                   break;
               }
               else
                   break;
           }
        }
        System.out.println("Is 'z' appear twice respectively? " + flog);
    }
}
