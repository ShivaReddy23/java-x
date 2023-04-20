
public class St59 {
	public static void main(String[] args) throws Exception {
        String str = "blacksea";
        String color1 = "black";
        String color2 = "red";

        if (str.length() > color1.length()){
            if (color1.equals(str.substring(0, color1.length())))
                System.out.println("The string begins with the color: " + color1);
            else if (color2.equals(str.substring(0, color2.length())))
                System.out.println("The string begins with the color: " + color2);
            else
                System.out.println("empty string");
        }

    }
}
