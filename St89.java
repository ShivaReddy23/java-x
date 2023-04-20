
public class St89 {
	public static void main(String[] args){
		String str="it 15 is25 a 20string";
		System.out.println("The original string: "+str);
		String str2 = str.replaceAll("\\D+"," ");
		System.out.println(str2);
		int a=Integer.parseInt(str2.substring(1,3));
		int b=Integer.parseInt(str2.substring(4,6));
		int c=Integer.parseInt(str2.substring(7,9));
		System.out.println("The sum of all the numbers in the string is: "+(a+b+c));
		}
}
