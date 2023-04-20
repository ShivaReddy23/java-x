
public class St102 {
	public static void main(String[] args) {
		String str_i = "1323";
		String str_l = "13625478965325";
		String str_f = "25.135F";
		String str_d = "21.25478254D";
		System.out.println("Convert String to int/Integer:");
		System.out.println("\""+str_i+"\" as int is "+Integer.parseInt(str_i)+" and as Integer is "+Integer.valueOf(str_i));
		System.out.println("\nConvert String to long/Long:");
		System.out.println("\""+str_l+"\" as long is "+Long.parseLong(str_l)+" and as Long is "+Long.valueOf(str_l));
		System.out.println("\nConvert String to float/Float:");
		System.out.println("\""+str_f+"\" as float is "+Float.parseFloat(str_f)+" and as Float is "+Float.valueOf(str_f));
		System.out.println("\nConvert String to double/Double:");
		System.out.println("\""+str_d+"\" as double is "+Double.parseDouble(str_d)+" and as Double is "+Double.valueOf(str_d));
		}
		}