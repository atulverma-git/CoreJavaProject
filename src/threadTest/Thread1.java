package threadTest;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("inside thread1");
		PerformReadandWrite writeObj = new PerformReadandWrite();
			for (int i=0; 1<=10; i++){
				writeObj.write(i);
			}	
	}

}
