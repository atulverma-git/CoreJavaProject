package collectionTest.customCollection;

public class ListNode<E> {
	private E value;
	
	private ListNode<E> next;
	/**
	 * @return the value
	 */
	public E getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(E value) {
		this.value = value;
	}

	/**
	 * @return the next
	 */
	public ListNode<E> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(ListNode<E> next) {
		this.next = next;
	}

	public ListNode(E newVal, ListNode<E> newNext){
		value = newVal;
		next = newNext;
	}
	
	
}
