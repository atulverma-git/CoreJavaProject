package collectionTest;

import java.util.LinkedList;

public class Stack<E> {
	private LinkedList<E> stack = new LinkedList<E>();
	
	// push element to the head
	public void push(E v){
		stack.add(v);
		System.out.println("at index: "+stack.indexOf(v));
	}
	
	// peeking element without removing
	public E peek(){
		return stack.getLast();
	}
	
	// pop element and remove.
	public E pop(){
		return stack.removeLast();
	}
	
	// return if stack is empty
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public String toString(){
		return stack.toString();
	}
}
