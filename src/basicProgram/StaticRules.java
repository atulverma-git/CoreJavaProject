package basicProgram;

public class StaticRules {
	
	static int i=10;
	
	static{
		System.out.println("i= "+i);
	}
	
	/*static{
		System.out.println("j="+j);      // will throw Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	}*/
	
	static void show(){
		System.out.println("show j:"+j);
	}

	public static void main(String[] args) {
		System.out.println("main calling show()");
		show();

	}
	static int j = 20;

}
