package collectionTest;

public class StackImpl {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		
		System.out.println("stack: "+stack);
		
		//popping elements
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
	}

}
