package threadTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SynchronizedTest {

	public static void main(String[] args) {
		Test1 test = new Test1();
		
		Thread t1 = new Thread(){
			public void run(){
				test.calculate();
			}
		};
		
		t1.start();
		System.out.println("main thread execute");
		synchronized (test) {
			while(test.sum==0){
				try {
					System.out.println("main is waiting");
						test.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				System.out.println("main is notified");
				System.out.println("sum: "+test.sum);
			
			}

		/*Thread t1 = new Thread(){
			public void run(){
				test.show1();
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				test.show2();
				try {
					test.show3();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t3 = new Thread(){
			public void run(){
				try {
					test.show3();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		*/
		/*t1.start();
		t2.start();
		t3.start();*/
	}

}

class Test1 {
	int i = 0;
	int sum = 0;
	public void calculate(){
		synchronized (this) {
			for(int i=1;i<=100;i++){
				sum=i+sum;
			}
			this.notify();
			System.out.println("notifying...... ");
			
			/*to check if after notifying .
			 * lock is released immediately
			 */
			Random rand = new Random();
			List<Integer> list = new ArrayList<>();
			for(int j=0;j<=1000000;j++){
				list.add(rand.nextInt(10000));
			}
			
			System.out.println("list size: "+list.size());
			Collections.sort(list);
		}
		
		
	}
	
	/*public synchronized void show1(){
		System.out.println("show1 :"+i++);
	}
	
	public synchronized void show2(){
		while(true){
			System.out.println("show2 :"+i++);
			if(i>=1000){
				break;
			}
		}
	}
	
	public void show3() throws InterruptedException{
		System.out.println("show3 :"+i++);
		Thread.sleep(2000);
		System.out.println("show3 after sleep :"+i);
		wait();
	}*/
}
