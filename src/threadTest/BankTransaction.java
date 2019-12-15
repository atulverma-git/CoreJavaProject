package threadTest;

public class BankTransaction {
	double balance;
	double amount;
	
	public synchronized void deposit(double amount){
		System.out.println("amount depositing...");
		balance+=amount;
		System.out.println("amount "+balance+" deosited successfully....");
		System.out.println("new balance is: "+balance);
		notify();
		
	}
	
	public synchronized void withdraw(double amount){
		System.out.println("withdrawing amount....");
		while(amount>balance){
			System.out.println("not sufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("Amount withdrawl successfully....\n New balance is: "+balance);
	}
}
