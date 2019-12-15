package threadTest;

/*
 * Description : this program logically right but syntactically wrong. 
 * Do not use "synchronized" keyword in run method of Thread.
 * Correct approach in written in RevisionProject -> com.thread2.ThreadSequenceImpl
 */
public class ThreadInSequence {
	volatile int status=1;
	volatile int counter = 1;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starting...");
		ThreadInSequence obj = new ThreadInSequence();
		Task1 t1= new Task1(obj);
		Task2 t2= new Task2(obj);
		Task3 t3= new Task3(obj);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main exiting...");

	}
}

class Task1 extends Thread{
	ThreadInSequence sequence;
	
	public Task1(ThreadInSequence sequence){
		super("Task1");
		this.sequence = sequence;
	}
	
	@Override
	public void run(){
		synchronized(sequence){
			for(int i=1;i<=10;i++){
				while(sequence.status!=1){
					try {
						sequence.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" running...."+sequence.counter++);
				sequence.status=2;
				sequence.notifyAll();
			}	
		}
	}
}

class Task2 extends Thread{
	ThreadInSequence sequence;
	
	public Task2(ThreadInSequence sequence){
		super("Task2");
		this.sequence = sequence;
	}
	
	@Override
	public void run(){
		synchronized(sequence){
			for(int i=1;i<=10;i++){
				while(sequence.status!=2){
					try {
						sequence.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" running...."+sequence.counter++);
				sequence.status=3;
				sequence.notifyAll();
			}	
			
		}
	}
}

class Task3 extends Thread{
	ThreadInSequence sequence;
	
	public Task3(ThreadInSequence sequence){
		super("Task3");
		this.sequence = sequence;
	}
	
	public void run(){
		synchronized(sequence){
			for(int i=1;i<=10;i++){
				while(sequence.status!=3){
					try {
						sequence.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" running...."+sequence.counter++);
				sequence.status=1;
				sequence.notifyAll();
			}	
			
		}
	}
}
