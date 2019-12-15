package collectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PlayWithCollections {


	@SuppressWarnings({"rawtypes","unused", "unchecked"})
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		System.out.println(al.size());
		
		Random rand = new Random();
		
		for(int i=1; i<=10;i++){
			al.add(rand.nextInt()*100);
		}
		
		System.out.println(al.size());
		
		Queue<String> queue = new LinkedList<String>();
		
//		queue.
	}

}
