package threadTest;

public class ThreadTest1{

	public static void main(String[] args){
		Thread t1 = new Thread(new Thread1(), "t1");
		Thread t2 = new Thread(new Thread2(), "t2");
		
		t1.start();
		//t2.start();
		
		
		
	}
}
