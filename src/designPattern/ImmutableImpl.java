package designPattern;

public class ImmutableImpl {

	public static void main(String[] args) {
		ImmutableDP im = new ImmutableDP(111,"xyz", 45);
		ImmutableDP im2 = new ImmutableDP(112,"abc", 34);
		
		System.out.println("im"+im);
		
		System.out.println("new im"+im);
		
	}

}
