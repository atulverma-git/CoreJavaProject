package advanceThread;

public class ThreadGroupTest1 {

	public static void main(String[] args) {
		/*
		 * main belongs to "main thread"
		 */
		System.out.println("main thread name: "+Thread.currentThread().getName());
		
		
		/* Main thread belongs to "main" ThreadGroup.
		** 
		*/
		System.out.println("main belongs to thread Group: "+Thread.currentThread().getThreadGroup().getName());
		
		/*
		 * main thread group parent Thread Group is "System"
		 */
		System.out.println("main groups parent thread group: "+Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		// ------------------------Custom ThreadGroup---------------------------
		
		ThreadGroup customGroup1 = new ThreadGroup("CustomGroup1");
		
		System.out.println("parent of customGroup1: "+customGroup1.getParent().getName()); // main
		
		// customize parent threadGroup
		
		ThreadGroup customGroup2 = new ThreadGroup(customGroup1, "CustomGroup2");
		
		System.out.println("parent of customGroup2: "+customGroup2.getParent().getName()); // CustomGroup1
		
		// Default Max priority is 10
		
		System.out.println("max priority: "+customGroup2.getMaxPriority());
	}

}
