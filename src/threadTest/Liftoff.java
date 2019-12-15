package threadTest;

public class Liftoff implements Runnable {
	int countdown = 10;
	public static int taskCount=0;
	private final int id = taskCount++;
	
	
	public String status(){
		return "#"+id+"("+(countdown>0?countdown:"litoff")+")";
	}
	public void run() {
		while(countdown-->0){
			System.out.println(status());
			Thread.yield();
		}
	}

}
