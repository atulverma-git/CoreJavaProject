package basicProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("enter Range");
		Scanner scn = new Scanner(System.in);
		
		int range = scn.nextInt();
		System.out.println("series is....");
		
		System.out.println(1);
		System.out.println(1);
		int prev1=1, prev2=1, fibonnaci;
		for(int i=3;i<=range;i++){
			fibonnaci=prev1+prev2;
			prev1=prev2;
			prev2=fibonnaci;
			System.out.println(fibonnaci);
		}
		scn.close();
		
	}
	

}
