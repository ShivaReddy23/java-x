import java.math.BigInteger;
public class D14 {
	    public static void main(String[] args) {

	        BigInteger bint = BigInteger.valueOf(Long.MAX_VALUE);

	        System.out.println("BigInteger value: " + bint);
	        long loval = bint.longValue();
	        System.out.println("Convert the said BigInteger to an long value: " + loval);
	        System.out.println("Convert the said BigInteger to an int value: " + bint.intValue());
	        System.out.println("Convert the said BigInteger to an short value: " + bint.shortValue());
	        System.out.println("Convert the said BigInteger to byte: " + bint.byteValue());
	        System.out.println("Convert the said BigInteger to exact long: " + bint.longValueExact());
	    }
	}

