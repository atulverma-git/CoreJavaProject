package basicProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String a = new String("Atul");
		System.out.println("atul hashcode:"+a.hashCode());
		a = "Ravi";
		System.out.println("ravi hashcode:"+a.hashCode());
		System.out.println(a);
		
		System.out.println("enter Series");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		StringBuilder sb = new StringBuilder();
		char[] charArr = str.toCharArray();
		System.out.println(charArr);
		int length = charArr.length;
		for(int i=length-1;i>=0;i--){
			sb.append(charArr[i]);
		}
		
		
		System.out.println(sb);
		scn.close();
	}

}
