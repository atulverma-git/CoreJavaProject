package threadTest;

public class DepositThread implements Runnable {
	BankTransaction bk;
	double amount;
	public DepositThread(BankTransaction obj, double amount){
		bk=obj;
		this.amount=amount;
	}
	public void run() {
		bk.deposit(amount);
	}

}
