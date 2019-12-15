package basicProgram;

import java.util.Scanner;

public class SwapTwoNoWithout3rdVariable {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int fstNo=scn.nextInt();
		System.out.println("enter 2nd No: ");
		int scndNo = scn.nextInt();
		
		System.out.println("Swapping...");
		fstNo = fstNo+scndNo;
		scndNo= fstNo-scndNo;
		fstNo=fstNo-scndNo;
		System.out.println("fstNo: "+fstNo+" scndNo: "+scndNo);
	}

}
