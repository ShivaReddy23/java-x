
public class St86 {
	public static void main (String[] arg){

		String str = "welllcommmmeee";
		int count=0;
		for (int i =0;i< str.length();i++){
		if (i< str.length()-2){
		if (str.charAt(i)== str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)){
		count++;
		}
		}

		}
		System.out.println("The given string is: "+str);
		System.out.println("The number of triples in the string is: "+count);
		}
}
