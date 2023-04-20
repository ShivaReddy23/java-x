
public class St44 {
	public static void main(String[] args) throws Exception {
        String str = "The quick brown fox jumps";
        System.out.println("The given string is: " + str);
        System.out.println("The string in reverse order is:" );
        recursiveReversedString(str, 0);

    }
    
    public static void recursiveReversedString(String s, int len) {
        if (len < s.length()-1){
            recursiveReversedString(s, len+1);
        }
        System.out.print(s.charAt(len));
    }
}
