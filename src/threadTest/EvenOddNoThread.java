package threadTest;

class PrintEvenOddNo{
	boolean isEven = true;
	
	public void printEvenNo(int num){
		synchronized (this) {
			if(!isEven){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Even: "+num);
			isEven=false;
			notify();
		}
	}
	
	public void printOddNo(int num){
		synchronized (this) {
			if(isEven){
				try {
//					System.out.println("waiting for odd no........");
					wait();
//					System.out.println("Odd No Found :)........");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Odd: "+num);
			isEven=true;
			notify();
		}
		
	}
}

class EvenNoThread implements Runnable{
	private PrintEvenOddNo printNum;
	int range;
	
	public EvenNoThread(PrintEvenOddNo printNum, int range){
		this.printNum=printNum;
		this.range=range;
	}
	
	@Override
	public void run() {
		for(int i=2;i<=range;i=i+2){
			printNum.printEvenNo(i);
		}
	}
}

class OddNoThread implements Runnable{
	private PrintEvenOddNo printNum;
	int range;
	
	public OddNoThread(PrintEvenOddNo printNum, int range){
		this.printNum=printNum;
		this.range=range;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=range;i=i+2){
			printNum.printOddNo(i);
		}
	}
}
public class EvenOddNoThread {

	public static void main(String[] args) {
		int range = 15;
		PrintEvenOddNo printNum = new PrintEvenOddNo();
		Thread t1 = new Thread(new OddNoThread(printNum, range));
		Thread t2 = new Thread(new EvenNoThread(printNum, range));
		t1.start();
		t2.start();
		
		
	}

}
