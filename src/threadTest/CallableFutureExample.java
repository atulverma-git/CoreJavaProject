package threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumIntegerCallable implements Callable<Integer>{
	Integer n;
	
	public SumIntegerCallable(Integer n) {
		this.n = n;
	}
	
	@Override
	public Integer call() throws Exception {
		
		return n*(n+1)/2;
	}
}

class SquareDoubleCallable implements Callable<Double> {
	 
    Double n;
 
    SquareDoubleCallable(Double n) {
           this.n = n;
    }
 
    @Override
    public Double call() throws Exception {
           return n*n;
    }
 
}

public class CallableFutureExample {
	
	private static int nThreads = 10;
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService executor = Executors.newFixedThreadPool(nThreads);
		
		Future<Integer> futureInteger = executor.submit(new SumIntegerCallable(10));
		Future<Double> futureDouble = executor.submit(new SquareDoubleCallable(10.0));
		
		System.out.println("SumIntegerCallable has returned > "+futureInteger.get());
	    System.out.println("SquareDoubleCallable has returned > "+futureDouble.get());
	        
	    executor.shutdown();
	}

}
