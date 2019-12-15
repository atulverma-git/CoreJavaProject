package threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorDemo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Creating annonymus Thread
		
		/*Runnable r1 = new Runnable(){
			public void run(){
				for(int i=0; i<=10;i++){
					System.out.println(Thread.currentThread().getName()+" : "+i);
					
				}
			}
		};
		
		Runnable r2 = new Runnable(){
			public void run(){
				for(int i=0; i<=10;i++){
					System.out.println(Thread.currentThread().getName()+" : "+i);
					
				}
			}
		};*/
		System.out.println("newCachedThreadPool...........................");
		//ExecutorService service = Executors.newCachedThreadPool();
//		service.submit(r1);
//		service.submit(r2);
		
		/*System.out.println(".............calling multiple task............");
		
		for(int i=0;i<=6;i++){
			 Future obj =service.submit(new Runnable(){
				public void run(){
					for(int i=0; i<=10;i++){
						System.out.println(Thread.currentThread().getName()+" : "+i);
						
					}
				}
			});
			 if(obj.get()==null){
				 System.out.println("Task is completed...");
			 }
			 if(obj.isDone()){
				 System.out.println("Task is completed...");
			 }
		}*/
		
		/*System.out.println("newFixedThreadPool...........................");
		service = Executors.newFixedThreadPool(10);
		service .submit(r1);*/
		
		// calling MyJob
		
	/*	MyJob1[] jobs = {new MyJob1("Bob"),
						new MyJob1("Mark"),
						new MyJob1("Grove"),
						new MyJob1("Zeal"),
						new MyJob1("Jeff")
						};*/
		
		ExecutorService execute = Executors.newFixedThreadPool(3);
		ThreadPoolExecutor exe = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
		/*for(MyJob1 job:jobs){
			execute.submit(job);
		}*/
		//execute.shutdown();
		
		//execute = Executors.newFixedThreadPool(3);
		
		Future<Integer>[] fArray = new Future[5];
		int i=0;
		MyCallable[] callableJobs ={new MyCallable(10),
									new MyCallable(20),
									new MyCallable(30),
									new MyCallable(40),
									new MyCallable(50),
									};
		for(MyCallable job:callableJobs){
			fArray[i] = exe.submit(job);
			i++;
			//Future fObj= execute.submit(job);
			//System.out.println(fObj.get());
		}
		
		for(Future obj:fArray){
				System.out.println("Future Tasks....");
				System.out.println(obj.get()+ " and task is done:"+obj.isDone());
			
		}
		execute.shutdown();
	}

}

class MyJob1 implements Runnable{
	String name;
	public MyJob1(String name){
		this.name = name;
	}
	
	public void run() {
			System.out.println(name+" job started by "+Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" job completed:"+Thread.currentThread().getName());
			
	}
}
class MyCallable implements Callable{
	int num;
	
	public MyCallable(int num){
		this.num = num;
	}
	
  public Object call() throws Exception {
	  System.out.println(Thread.currentThread().getName()+" is calculating sum of "+num+" numbers");
	  int sum=0;
	  for(int i=1;i<=num;i++){
		  sum+=num;
	  }
		
	  return sum;
}
}

