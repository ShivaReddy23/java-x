public class St91 {
	public static void main(String[] args) throws Exception {
        String str = "mam is in the room".toLowerCase();
        System.out.println("The given string is: " + str);
        str += " ";
        int len = str.length();
        int count = 0;
        for (int i = 1; i < len; i++){
            if ((str.charAt(i-1) == 'm' || str.charAt(i-1) == 'n') && str.charAt(i) == ' ')
                count++;
        }
        System.out.println("Are the appearance of 'the' and 'is' equal? " + count);
    }
	
}
