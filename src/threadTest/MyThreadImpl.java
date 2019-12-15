package threadTest;

public class MyThreadImpl implements RunnableImpl{
	public static void main(String arg[]){
		RunnableImpl obj = new MyThreadImpl();
		RunnableImpl obj2 = new MyThreadImpl();
		ThreadImpl t1 = new ThreadImpl(obj, "t1");
		ThreadImpl t2 = new ThreadImpl(obj2, "t2");
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		System.out.println("MyThreadImpl run is running: "+ThreadImpl.getCurrentThread().getThreadName());
	}

}
