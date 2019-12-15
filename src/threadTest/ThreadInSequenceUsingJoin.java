package threadTest;

public class ThreadInSequenceUsingJoin {

	public static void main(String[] args) {
		System.out.println("main thread running");
		
		for(int i=0;i<10;i++){
			for(int j=1;j<=3;j++){
				new T1(""+j);
			}
		}
		System.out.println("main exiting...");
	}
		
}

	
class T1 implements Runnable{
		Thread t1;
		String desc;
		
		public T1(String desc){
			t1=new Thread(this,desc);
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void run(){
			System.out.println(Thread.currentThread().getName()+" running....");
		}
}


