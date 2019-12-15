package basicProgram;

public class StackOverFlowTest {
	
	//StackOverFlowTest obj1 = new StackOverFlowTest();
	
	public StackOverFlowTest(){
		StackOverFlowTest obj1 = new StackOverFlowTest();
		System.out.println("constructor called");
	}
	
	public void show(){
		System.out.println("inside show method");
	}

	public static void main(String[] args) {
		StackOverFlowTest obj2 = new StackOverFlowTest();
		obj2.show();
	}

}
