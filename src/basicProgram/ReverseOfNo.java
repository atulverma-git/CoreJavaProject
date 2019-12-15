package basicProgram;

import java.util.Scanner;

public class ReverseOfNo {

	public static void main(String[] args) {
		System.out.println("enter Series");
		Scanner scn = new Scanner(System.in);
		
		int i = scn.nextInt();
		
		int reminder=0;
		int reverse=0;
		while(i>0){
			reminder=i%10;
			reverse = 10*reverse+reminder;
			i=i/10;
		}
		System.out.println("reverse: "+reverse);
		
		scn.close();
	}

}
