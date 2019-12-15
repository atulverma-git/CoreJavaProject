package collectionTest;

import java.util.LinkedList;

public class Queue<E> {
	private LinkedList<E> queue = new LinkedList<E>();
	
	public void offer(E e){
		queue.add(e);
	}
	
	public E poll(){
		return queue.removeFirst();
	}
	
	public E element(){
		return queue.getFirst();
	}
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public String toString(){
		return queue.toString();
	}
	
	public int size(){
		return queue.size();
	}

}
