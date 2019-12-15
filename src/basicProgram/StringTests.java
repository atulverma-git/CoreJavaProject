package basicProgram;

public class StringTests {

	public static void main(String[] args) {
		String str1="String".replace('t','T');
		String str2="String".replace('t','T');
		System.out.println(str1);
		System.out.println(str2);
		
		if("String".replace('t','T')=="String".replace('t','T') ){
			System.out.println("STRING");
		}else{
			System.out.println("String");
		}
		
		String s1 = "String";
		String s2 = "String";
		System.out.println("s1==s2: "+(s1==s2));
	}

}
