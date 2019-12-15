package collectionTest;

public class QueueImpl {

	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		
		q.offer("First");
		q.offer("second");
		q.offer("third");
		q.offer("fourth");
		q.offer("Fifth");
		q.offer("sixth");
		
		System.out.println("Queue: "+q);
		
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}
	

}
