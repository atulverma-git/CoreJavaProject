package basicProgram;


public class BlankFinalVarTest {
	final String str;
	
	public static String show(String str){
		return "Mr. "+str;
	}
	
	// Not Allowed will throw compile time exception as final field might be uninitialized
	//public BlankFinalVarTest(){}
	
	// final variable has to be initialized either in constructor or at the time
	// of declaration
	public BlankFinalVarTest(String str){
		System.out.println(this.str=str);
	}
	
	public static void main(String str[]){
		System.out.println(show("Atul"));
	}
}
