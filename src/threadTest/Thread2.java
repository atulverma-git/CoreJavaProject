package threadTest;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside thread2");
		PerformReadandWrite readObj = new PerformReadandWrite();
		for(Integer i: readObj.read()){
			System.out.println("reading elment: "+i);
		}
	}

}
