package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
	int taskNo;
	
	public MyRunnable(int taskNo) {
		this.taskNo=taskNo;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing task No: "+taskNo);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

public class ExecutorServiceExample {
	private static int nThread = 2;
	private static int nTask = 10;

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(nThread);
		
		System.out.println("executor created with 2 thread.");
		
		for(int i=1; i<=nTask; i++){
			executor.execute(new MyRunnable(i));
		}
		
		executor.shutdown();
		System.out.println("executor has been shutDown."+executor.isShutdown());
	}

}
