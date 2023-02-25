public class p3new {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Input list of numbers: ");
	String str1 = input.nextLine();

	String[] lo1 = str1.split(", ");

	int[] loNum1 = new int[lo1.length];
	ArrayList newArray = new ArrayList();

	for (int i = 0 ; i < lo1.length ; i++)
	loNum1[i] = Integer.parseInt(lo1[i]);

	for (int j = lo1.length-1 ; j >= 0 ; j--){
	if (loNum1[j] == 10)
	break;

	newArray.add(loNum1[j]);
	}
	Collections.reverse(newArray);
	System.out.println(newArray);
	}
	}
