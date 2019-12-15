package basicProgram;


public class OverloadingTest {
	
	private static void func(Object i){
		System.out.println("Object: "+i);
	}
	
	private static void func(Integer i){
		System.out.println("Integer: "+i);
	}
	
	private static void func(int i){
		System.out.println("int: "+i);
	}
	
	private static void func(long i){
		System.out.println("long: "+i);
	}
	
	public static void main(String[] args) {
		Integer num = 10;
		func(num);
	}

}
