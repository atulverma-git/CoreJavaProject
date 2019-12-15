package basicProgram;

public class TestArraySizeDynamically {
	
	public void TestArraySizeDynamically(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		int size=0;
		arr[size++]=1;
		System.out.println(arr[0]);
		System.out.println(size);
		/* ***** System.out.println(arr.length); */
		int mask = 0x000f;
		int value = 0x2222;
		System.out.println(value & mask);
		
	}

}
