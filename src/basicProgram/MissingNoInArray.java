package basicProgram;

import java.util.Random;

public class MissingNoInArray {

	public static void main(String[] args) {
		int[] no= {1,2,4,5,6,7,8,9,10};
		int sum = sumOfNo(no.length+1);
		int sumOfEle = sumOfElements(no);
		int missingNo = sum-sumOfEle;
		System.out.println("missing No is: "+missingNo);
		
	
	}
	
	public static int sumOfNo(int n){
		return n*(n+1)/2;
	}
	
	public static int sumOfElements(int[] noArr){
		int sum = 0;
		for(int i=0;i<noArr.length;i++){
			sum+=noArr[i];
		}
		return sum;
	}

}
