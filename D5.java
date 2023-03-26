import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.TimeZone;
import java.io.*;
public class D5 {

	    public static void main(String[] args)
	    {
	        Date localTime = new Date();
	        DateFormat s = new SimpleDateFormat("dd/MM/yyyy"
	                                            + " "
	                                            + " HH:mm:ss");
	        s.setTimeZone(TimeZone.getTimeZone("GMT"));
	        System.out.println("local Time:" + localTime);
	        System.out.println("Time IN Gmt : "
	                           + s.format(localTime));
	    }
	}

