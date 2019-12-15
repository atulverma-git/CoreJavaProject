package threadTest;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrentLockDemo1 {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		
		lock.lock();
		lock.lock();
		
		System.out.println("is locked: "+lock.isLocked());
		System.out.println("is held by current thread: "+lock.isHeldByCurrentThread());
		System.out.println("is fair: "+lock.isFair());
		System.out.println("lock hold count: "+lock.getHoldCount());
		
		lock.unlock();
		System.out.println("lock hold count after unlock: "+lock.getHoldCount());
		
		lock.unlock();
		System.out.println("lock hold count after unlock: "+lock.getHoldCount());
		
		System.out.println("is locked after unlock: "+lock.isLocked());
		
		
	}

}
