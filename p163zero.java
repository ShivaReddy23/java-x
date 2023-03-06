public class p63zero {
	void convertAndCount(int num)
    {
        int count = -1;
 
        String binary = Integer.toBinaryString(num);
 
        for (int i = 0; i < binary.length(); i++)
 
            if (binary.charAt(i) == '1')
 
                count++;
 
        System.out.println("The binary representation of " + num
                           + " is : " + binary);
 
        System.out.println("Number of zero bits : "+ count);
    }
 
    public static void main(String[] args)
    {
        p63zero obj = new p63zero();
 
        obj.convertAndCount(25);
    }
}

