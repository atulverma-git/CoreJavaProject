package threadTest;

import java.util.concurrent.TimeUnit;

public class TestDeadlockExample1 {

	public static void main(String[] args) {
		String resource1="Resource 1";
		String resource2="Resource 2";
		
		Thread t1= new Thread("t1"){
			public void run() {
				synchronized (resource1) {
					System.out.println(resource1+" is locked by "+Thread.currentThread().getName());
					try {
						TimeUnit.MILLISECONDS.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(resource2){
						System.out.println(resource2+" is locked by "+Thread.currentThread().getName());
					}
				}
			}
		};
		
		Thread t2= new Thread("t2"){
			public void run() {
				synchronized (resource2) {
					System.out.println(resource2+" is locked by "+Thread.currentThread().getName());
					try {
						TimeUnit.MILLISECONDS.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(resource1){
						System.out.println(resource1+" is locked by "+Thread.currentThread().getName());
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
