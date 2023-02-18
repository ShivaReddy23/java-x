public class Hexagon {
	public static double hexagonArea(double s)
    {
        return ((3 * Math.sqrt(3) *
                (s * s)) / 2);
    }
         
    // Driver Code
    public static void main(String[] args)
    {    
        // Length of a side
        double s = 6;     
        System.out.print("Area: " +
                          hexagonArea(s) );
    }
}
