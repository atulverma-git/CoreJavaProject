package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankTransactionImpl {
	
	public static void main(String[] args) {
		BankTransaction bk = new BankTransaction();
		WithdrawThread wd= new WithdrawThread(bk, 5000);
		DepositThread dep = new DepositThread(bk, 3000);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(dep);
		executor.submit(wd);
		executor.submit(new DepositThread(bk, 4000));
		
		executor.shutdown();
		
		
		
		/*Thread t1 = new Thread(dep, "deposit_Thread");
		Thread t2 = new Thread(wd, "withdraw_Thread");
		Thread t3 = new Thread(new DepositThread(bk, 4000), "Dep2");
		t2.start();
		t1.start();
		t3.start();*/
	}

}
