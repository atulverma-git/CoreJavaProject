package basicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumberInRange {

	public static void main(String[] args) {
		List<Integer> oddNos= findOdd(3,11);
		System.out.println(oddNos);
		
		
		System.out.println(findNumberInList(Arrays.asList(1,5,3,7,2), 10));
	}
	
	public static List<Integer> findOdd(int l, int r){
		 List<Integer> oddNo = new ArrayList<>();
	        for(int i=l;i<=r;i++){
	            if(!(i%2==0)){
	                oddNo.add(i);
	            }
	        }
	        return oddNo;
	}
	
	public static boolean findNumberInList(List<Integer> list,int k){
		boolean flag = list.contains(k);
		return flag;
	}

}
