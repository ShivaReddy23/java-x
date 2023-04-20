
public class St51 {
	 public static void main(String[] args) throws Exception {
	        String str = "Shivani";
	        System.out.println("The given string is: " + str);
	        System.out.println("The duplicate characters and counts are:");
	        int[] Mc = new int[256];
	        for (int i = 0; i < str.length(); i++){
	            Mc[str.charAt(i)]++;
	        }
	        for (int i = 0; i < Mc.length; i++){
	            if (Mc[i] > 1)
	                System.out.println((char) i + "  appears  "+Mc[i]+ "  times");
	        }
	    }
}
