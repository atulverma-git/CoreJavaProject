package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftoffImpl {

	public static void main(String[] args) {
		Thread t1=new Thread(new Liftoff(), "t1");
		t1.start();
		
		
		//Cahced Thread Pool
		//ExecutorService exe = Executors.newCachedThreadPool();
		
		//Fixed Thread Pool
		//ExecutorService exe = Executors.newFixedThreadPool(5);
		
		//Single Thread Executor
		ExecutorService exe = Executors.newSingleThreadExecutor();
		
		for(int i=0; i<=5; i++){
			exe.execute(new Liftoff());
		}
		
		exe.shutdown();
	}

}
