package basicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountingBits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int no = scn.nextInt();
		List<Integer> list = getBitsUsingList(no);
		for(Integer n:list){
			System.out.println(n);
		}
	}
	
	public static List<Integer> getBitsUsingList(int n){
		LinkedList<Integer> bitList = new LinkedList<>();
		char[] toBin = Integer.toBinaryString(n).toCharArray();
		int count=0;
		for(int i=0; i<toBin.length;i++){
			if(toBin[i]=='1'){
				bitList.add(i+1);
				count++;
			}
		}
		bitList.addFirst(count);
		return bitList;
	}
	public static List<Integer> getOneBits(int n) {
		char[] toBin = Integer.toBinaryString(n).toCharArray();
        Integer[] position = new Integer[toBin.length];
        int length =0;
        for(int i=0;i<toBin.length;i++){
            int pos = i;
            if(toBin[i]=='1'){
                position[length]=pos+1;
                length++;
            }
        }
        position = Arrays.copyOf(position, length);
        List<Integer> positionList = Arrays.asList(position);
        List<Integer> outputList = new ArrayList<>();
        outputList.add(length);
        outputList.addAll(positionList);
        return outputList;
        //return positionList.(Arrays.asList(position));


    }
}
