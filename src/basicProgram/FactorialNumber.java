package basicProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no");
		int number = scan.nextInt();
		
		int factorial = 1;
		
		for(int i=1;i<=number;i++){
			factorial=factorial*i;
		}
		System.out.println("factorial of "+number+" is "+ factorial);
		scan.close();
	}

}
