public class p230new {
	public static void main(String[] args) {
		String str="python is more popular than java", firstWord=str.substring(0,6),
		lastWord=str.substring(str.length()-4,str.length());
		System.out.println("Original String: \n"+str);
		System.out.println("New String: \n"+lastWord+str.substring(6,str.length()-4)+firstWord);
		}
		}

