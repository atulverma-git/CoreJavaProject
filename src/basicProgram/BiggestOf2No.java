package basicProgram;

import java.util.Scanner;

public class BiggestOf2No {

	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		System.out.println("Enter first No:");
		int fst = scn.nextInt();
		System.out.println("Enter second No:");
		int scnd = scn.nextInt();
		
		int bigNo = (fst>scnd?fst:scnd);
		
		System.out.println("bigger No is: "+bigNo);
		scn.close();*/
		
		// testing Modulus without % operator
		int a = 2;
		int b = 10;
		int c = a-(a/b)*b;
		System.out.println(c);
		int result = a;
		while(result-b>=0){
			result-=b;
			System.out.println(result);
		}
		
		System.out.println("result:"+result);
	}

}
