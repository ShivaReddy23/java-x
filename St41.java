public class St40 {
	public static void main(String[] args) throws Exception {
        String str = "abcdefghijklmnopqrstuvwxy";
        System.out.println("The given string is: " + str);
        int numOfParts = 5;


        if (str.length() % numOfParts == 0){
            int index = 0;
            int lenOfLine = str.length() / numOfParts;

            System.out.println("The string divided into 5 parts and they are: ");

            for (int i = 0; i < numOfParts; i++) {
                for (int j = index; j < lenOfLine + index; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.println();
                index += lenOfLine;
            }
        } else {
            System.out.println("The size of the given string is not divisible by " + numOfParts);
        }
    }
}
