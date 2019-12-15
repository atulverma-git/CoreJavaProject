package threadTest;
 
public class ThreadImpl implements RunnableImpl {
	private static ThreadImpl threadObj;
	private RunnableImpl runnable;
	private String threadName;
	
	
	public String getThreadName() {
		return threadName;
	}
	
	public static  ThreadImpl getCurrentThread(){
		return threadObj;
		
	}
	
	public ThreadImpl() {
		runnable = this;
		threadObj= this;
	}
	public ThreadImpl(RunnableImpl runObj, String name){
		threadObj = this;
		runnable = runObj;
		threadName = name;
	}
	
	public void start(){
		runnable.run();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
