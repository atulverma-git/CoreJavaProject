package threadTest;

public class WithdrawThread implements Runnable {
	BankTransaction bk;
	double amount;
	public WithdrawThread(BankTransaction obj, double amount){
		bk=obj;
		this.amount=amount;
	}
	public void run() {
		bk.withdraw(amount);
	}

}
