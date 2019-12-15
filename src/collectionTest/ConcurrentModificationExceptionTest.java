package collectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionTest{

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		intList.add(60);
		
		Thread th = new Thread(){
			@Override
			public void run() {
				super.run();
				intList.add(100);
			}
		};
		Thread th2 = new Thread(){
			@Override
			public void run() {
				super.run();
				intList.add(300);
			}
		};
		Thread th3 = new Thread(){
			@Override
			public void run() {
				super.run();
				intList.add(200);
			}
		};
		
		th.start();
		th2.start();
		th3.start();
		Iterator<Integer> itr = intList.iterator();
		while(itr.hasNext()){
			int i = itr.next();
			System.out.println(i);
		}
		
		
	}

}
