public class p227space {
	public static void main(String[] args) {

		String str="Thank you for your comment and your participation.";
		System.out.println(str);
		String[] array= str.split(" ");
		System.out.println("The longest word from the string is: "+getLongestWord(array));
		}

		public static String getLongestWord(String[] array) {
		int index = 0;
		int elementLength = array[0].length();
		for(int i=1; i< array.length; i++) {
		if(array[i].length() > elementLength) {
		index = i; elementLength = array[i].length();
		}
		}
		return array[index];
		}
		}

