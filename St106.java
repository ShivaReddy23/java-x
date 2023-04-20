
public class St106 {
	public static void main(String[] args) throws Exception {
        String str = "PHP";
        int numOfRepeating = 7;
        System.out.println("Original string: " + str);
        String s = str;
        boolean flog = true;

        if (str.isEmpty())
            flog = false;
        if (Integer.MAX_VALUE / 2 < str.length())
            throw new OutOfMemoryError("Maximum size of a String will be exceeded");


        if (flog) {
            for (int i = 0; i < numOfRepeating; i++) {
                str += s;
            }
        }
        System.out.println("\nAfter repeating 7 times: " + str);
    }
}
