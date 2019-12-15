package threadTest;

import collectionTest.Queue;

public class ProducerConsumerClassical {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		Thread t1 = new Thread(new ClassicalProducer(queue));
		Thread t2 = new Thread(new ClassicalConsumer(queue));
		
		t1.start();
		t2.start();
		
	}

}

class ClassicalProducer implements Runnable{
	private final Queue queue;
	
	public ClassicalProducer(Queue queue){
		this.queue = queue;
	}
	public void run() {
		for(int i=1; i<=10;i++){
			synchronized (queue){ 
				while(queue.size()>1){
					try {
						System.out.println("Queue is full....");
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Producing.."+i);
				queue.offer(i);
				queue.notify();
			}
			
		}
	}
}

class ClassicalConsumer implements Runnable{
	
	private final Queue queue;
	
	public ClassicalConsumer(Queue queue){
		this.queue = queue;
	}
	public void run() {
		while(true){
			synchronized (queue) {
				while(queue.size()==0){
					System.out.println("Queue is empty");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("consuming..."+queue.poll());
				queue.notify();
			}
			
		}
		
	}
}