import java.io.File;
	import java.util.Date;
public class Jio1 {
	     public static void main(String a[])
	     {
	        File file = new File("/home/students/");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
}
