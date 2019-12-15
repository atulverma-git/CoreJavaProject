package collectionTest.customCollection;

public class CustomQueueImpl {

	public static void main(String[] args) {
		CustomQueue<String> queue = new CustomQueue<String>(5);
		/*try{
		queue.peek();
		}catch(QueueEmptyException qe){
			qe.printStackTrace();
		}*/
		
		queue.offer("1st");
		queue.offer("2nd");
		queue.offer("3rd");
		queue.offer("4th");
		//queue.offer("5th");
		
		System.out.println("displaying Queue.........");
		queue.display();
		
		System.out.println(queue.poll());
		
		System.out.println("after Poll");
		
		queue.display();
		
System.out.println(queue.poll());
		
		System.out.println("after Poll");
		
		queue.display();
		
	}

}
