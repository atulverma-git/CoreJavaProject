package basicProgram;

public class InfiniteConstructor {
	
	public InfiniteConstructor(){
		System.out.println("inside const...");
		InfiniteConstructor obj = new InfiniteConstructor();
	}
	public static void main(String[] args) {
		System.out.println("calling InfiniteConstructor const()");
		InfiniteConstructor obj = new InfiniteConstructor();
	}

}
