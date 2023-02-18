import java.nio.charset.Charset;
	import java.util.Iterator;
	import java.util.Map;
public class p40 {
	    public static void main(String[] args)
	    {
	        Map<String, Charset> charsets
	            = Charset.availableCharsets();
	  
	        Iterator<Charset> iterator
	            = charsets.values().iterator();
	  
	        while (iterator.hasNext()) {
	  
	            Charset all = (Charset)iterator.next();
	  
	            System.out.print(all.displayName() + " ");
	        }
	    }
	}