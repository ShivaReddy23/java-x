
public class T1 {
	public class Hello_world_thread extends Thread {
		  public void run() {
		    System.out.println("Hello, World!");
		  }
		  public static void main(String[] args) {
		    Hello_world_thread thread = new Hello_world_thread();
		    thread.start();
		  }}}
