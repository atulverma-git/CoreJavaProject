package basicProgram;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Reverse String....");
		System.out.println(reverseString("hello this is reverse string"));
	}
	
	public static String reverseString(String str){
		if(str.length()==1){
			return str;
		}else{
			return str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
		}
	}
}
