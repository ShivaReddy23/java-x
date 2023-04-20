public class St94 {
	public static void main(String[] args) {
		String str="rotavator",str2="";
		System.out.println("The given string is: "+str);

		int j=0;
		for(int i=str.length()-1;i>=0;i--) {
		if(str.charAt(i)==str.charAt(j)) {
		str2+=str.charAt(i);
		j++;
		}
		else break;
		}
		System.out.print("The longest mirror image string in the string is: "+str2);
		}
}
