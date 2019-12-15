package collectionTest.customCollection;

import java.util.Arrays;

public class ArrayListCustom<E> {
	private int initialCapacity = 10;
	private Object[] elementData = {};
	private int size=0;    // actual size of the arrayList
	
	// initializing Array
	public ArrayListCustom(){
		elementData = new Object[initialCapacity];
	}
	
	// add element to the arrayList
	public void add(E e){
		if(size==elementData.length){
			ensureCapacity(); 			// ensure capacity and double the capacity
		}
		elementData[size++]=e;
	}
	
	/**
	   * method increases capacity of list by making it double.
	*/
	private void ensureCapacity() {
		int newCapacity = elementData.length*2;
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	//get Element from the arrayList
	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index<0||index>=size){
			throw new IndexOutOfBoundsException();
		}else{
			return (E)elementData[index];
		}
	}
	
	@SuppressWarnings("unchecked")
	public E remove(int index){
		if(index<0||index>=size){
			throw new IndexOutOfBoundsException();
		}else{
			Object removedObject = elementData[index];
			for(int i=index;i<size-1;i++){
				elementData[i]=elementData[i+1];
			}
			size--;
			return (E)removedObject;
		}
	}
	
	public void display(){
		if(size==0){
			System.out.println("List is empty");
		}else{
	      System.out.print("Displaying list : ");
	      for(int i=0;i<size;i++){
	             System.out.print(elementData[i]+" ");
	      }
	      System.out.println();
		}
	  }
	
	public int indexOf(E e){
		int index=-1;
		for(int i=0;i<size;i++){
			if(elementData[i]==e){
				index=i;
			}
		}
		return index;
	}

}
