package basicProgram;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentrrantLockTest {

	public static void main(String[] args) {
		Thread t1 = new ThreadLock("Thread1");
		Thread t2 = new ThreadLock("Thread2");
		
		t1.start();
		t2.start();
		
	}

}

class ThreadLock extends Thread{
	static Lock lock= new ReentrantLock();
	
	public ThreadLock(String str){
		super(str);
	}
	
	@Override
	public void run() {
		do{
			try{
				if(lock.tryLock(5000, TimeUnit.MICROSECONDS)){
					System.out.println(Thread.currentThread().getName()+" got the lock");
					Thread.sleep(3000);
					lock.unlock();
					System.out.println(Thread.currentThread().getName()+" released the lock");
					break;
				}else{
					System.out.println(Thread.currentThread().getName()+" trying again");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}while(true);
	}
}