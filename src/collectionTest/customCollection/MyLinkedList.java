package collectionTest.customCollection;

public class MyLinkedList <E>{
	private ListNode<E> head;
	private ListNode<E> current;
	private ListNode<E> previous;
	
	public void insertFirst(E val){
		ListNode<E> node = new ListNode<E>(val, null);
		
		// if will be true at the time of first insertion
		if(head==null){
			head = node;
		}else{
			node.setNext(head);
			head=node;
		}
	}
	
	public void insertLast(E val){
		ListNode<E> node = new ListNode<E>(val, null);
		
		// if will be true at the time of first insertion
		if(head==null){
			head = node;
		}else{
			current=head;
			// traverse through that node whose Next is null
			while(current!=null){
				previous=current;				// penultimate node
				current=current.getNext();
			}
			previous.setNext(node);				// assign newly added node as Next.S
		}
	}
	
	public E deleteFirst(){
		E val=null;
		if(head!=null){
			val=head.getValue();
			head=head.getNext();
		}
		return val;
	}
	
	public E deleteLast(){
		if(head!=null){
			current=head;
			while(current.getNext()!=null){
				previous=current;
				current=current.getNext();		// traversing to the Last node whose next is Null
			}
			previous.setNext(null);
			return current.getValue();
		}
		return null;
	}
	
	
}
