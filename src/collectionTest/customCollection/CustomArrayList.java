package collectionTest.customCollection;

import java.util.Arrays;

public class CustomArrayList <E>{
	private Object[] data = {};
	private int initialCapacity = 10;
	private int size=0;
	
	public CustomArrayList(){
		data = new Object[initialCapacity];
	}
	
	private void ensureCapacity(){
		initialCapacity = initialCapacity*2;
		data = Arrays.copyOf(data, initialCapacity);
	}
	
	public void add(E e){
		if(size==data.length){
			ensureCapacity();
		}
		data[size++]=e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index<0|| index>size){
			throw new IndexOutOfBoundsException();
		}else
			return (E)data[index];
	}
	
	@SuppressWarnings("unchecked")
	public void display(){
		for(Object e: data){
			System.out.print((E)e+" ");
		}
	}
	
	@SuppressWarnings("unchecked")
	public E remove(int index){
		
		if(index<0||index>=size){
			throw new IndexOutOfBoundsException();
		}else{
			Object removedObj=data[index];
			for(int i=index;i<size;i++){
				data[i]=data[i+1];
			}
			size--;
			return (E)removedObj;
			
		}
	}
	
	public int indexOf(E e){
		int index=-1;
		for(int i=0;i<size;i++){
			if(data[i]==e){
				index=i;
			}
		}
		return index;
	}

}
