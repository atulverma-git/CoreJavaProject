package collectionTest.customCollection;

import java.util.Arrays;

import com.myExceptions.QueueEmptyException;

public class CustomQueue<E> {
	private int initialCapacity;
	
	private Object[] element = {};
	
	private int size =0;
	
	public CustomQueue(int capacity){
		this.initialCapacity = capacity;
		element = new Object[initialCapacity];
	}
	
	// add element to the end of the Queue.
	public boolean offer(Object ob){
		if(size==element.length)
		{
			ensureSize(element);
		}
		element[size++]=ob;
		return true;
	}

	// increase size of the Queue
	private void ensureSize(Object[] element) {
		element = Arrays.copyOf(element, initialCapacity*2);
	}
	
	// this method returns head of the element only
	@SuppressWarnings("unchecked")
	public E peek(){
		if(size==0){
			throw new QueueEmptyException();
		}
		return (E)element[0];
	}
	
	// this method returns head of the element and removes it
	@SuppressWarnings("unchecked")
	public E poll(){
		int index = 0;
		if(size==0){
			throw new QueueEmptyException();
		}
		Object removedObject = element[index];
		System.out.println("object to be removed: ");
		for(int i=index;i<size-1;i++){
			element[i]=element[i+1];
		}
		size--;
		return (E)removedObject;
	}
	
	public void display(){
		System.out.println("Current size of the Queue is:"+size);
		if(size==0){
			throw new QueueEmptyException();
		}
		for(int i=0;i<size;i++){
			System.out.println(element[i]);
		}
	}
	
}
