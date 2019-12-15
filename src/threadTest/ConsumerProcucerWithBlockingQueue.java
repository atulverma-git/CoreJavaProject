package threadTest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProcucerWithBlockingQueue {
	public static void main(String[] args){
		//BlockingQueue<Integer> servingQueue = new ArrayBlockingQueue<>(10);
		BlockingQueue<Integer> servingQueue = new LinkedBlockingQueue<>();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Producer(servingQueue), "Producer_Thread");
		executor.submit(new Consumenr(servingQueue),"Consumer1");
		executor.submit(new Consumenr(servingQueue),"Consumer2");
		
		executor.shutdown();
		/*Thread t1 = new Thread(new Producer(servingQueue), "Producer_Thread");
		Thread t2 = new Thread(new Consumenr(servingQueue),"Consumer1");
		Thread t3 = new Thread(new Consumenr(servingQueue),"Consumer2");
		
		
		t2.start();
		t3.start();
		t1.start();*/
	}
	

}

class Producer implements Runnable{
	private final BlockingQueue<Integer> servingQueue;
	
	public Producer(BlockingQueue<Integer> queue){
		servingQueue=queue;
	}
	
	public void run() {
		for(int i=0; i<=10; i++){
			System.out.println("Producing..."+i);
			try {
				servingQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumenr implements Runnable{
	private final BlockingQueue<Integer> servingQueue;
	public Consumenr(BlockingQueue<Integer> queue){
		servingQueue = queue;
	}
	public void run() {
		while(true){
			try {
				System.out.println(Thread.currentThread().getName()+" consumed: "+servingQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}