package basicProgram;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first No:");
		int fstNo= scn.nextInt();
		System.out.println("enter 2nd  No:");
		int scndNo= scn.nextInt();
		System.out.println("enter third No:");
		int thrdNo= scn.nextInt();
		
		int largestNo = (fstNo>scndNo?(fstNo>thrdNo?fstNo:thrdNo):scndNo);
		System.out.println("largestNo: "+largestNo);
		scn.close();
	}

}
