package basicProgram;

public class EqualsOperator {

	public static void main(String[] args) {
		String str1= "String1";
		String str2 = new String("String1");
		String str3 = new String(str1);
		String str4 = str1;
		String str5 = "String1";
		
		String str6 = "Sub String1";
		
		System.out.println("str1==str2 "+(str1==str2));
		
		System.out.println("str1==str3 "+(str1==str3));
		
		System.out.println("str2==str3 "+(str2==str3));
		
		System.out.println("str1==str4 "+(str1==str4));
		
		System.out.println("str1==str5 "+(str1==str5));
		
		if(str1.equals(str2)){
			System.out.println("str1 and str2 are equals");
		}
		
		if(str1.equals(str3)){
			System.out.println("str1 and str3 are equals");
		}
		
		if(str1.equals(str4)){
			System.out.println("str1 and str4 are equals");
		}
		
		System.out.println(str2.equals("Sub String1".substring(4, 11)));
		
		String name = "mr atul";
		name = name.substring(name.indexOf('m'), 1).toUpperCase().concat(name.substring(name.indexOf('m')+1));
		System.out.println(name);
	}

}
