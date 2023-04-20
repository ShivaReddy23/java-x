
public class St49 {
	public static void main (String[] arg){

		String str ="godistoogood";
		for (int i=0;i< str.length();i++){
		int m=0;
		System.out.println("Reading: "+str.charAt(i) );
		for (int j=0;j<=i;j++){
		if ((str.charAt(m)==str.charAt(j)&&m!=j)){
		m++;
		j=0;
		}

		}
		System.out.println("The first non-repeating character so far is: " + str.charAt(m));

		}
		}
}
