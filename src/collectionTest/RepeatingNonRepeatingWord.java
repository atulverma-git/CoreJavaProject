package collectionTest;

import java.util.*;
import java.util.Scanner;

public class RepeatingNonRepeatingWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter string");
		String input = scn.nextLine();
		
		
		
		String[] strArray = input.split("\\s");
		
		Map<String, Integer> stringMap = new LinkedHashMap<String, Integer>();
		
		for(String str:strArray){
			if(stringMap.containsKey(str)){
				stringMap.put(str, stringMap.get(str)+1);
			}
			else{
				stringMap.put(str, 1);
			}
		}
		
		
		for(String str:strArray){
			if(stringMap.get(str)==1){
			  System.out.println("first non repeating string is: "+str);
			  break;
			}
		}
		
		for(String str:strArray){
			if(stringMap.get(str)>1){
			  System.out.println("first repeating string is: "+str);
			  break;
			}
		}
		
		scn.close();
		
	}

}
