package collectionTest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NoRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner scn = new Scanner(System.in);

		String input = scn.nextLine().replaceAll("\\s", "");
		System.out.println("modified input:"+input);
		char[] charArray = input.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(char ch:charArray){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		
		for(char ch:charArray){
			if(map.get(ch)>1){
				System.out.println("first repeating character: "+ch);
				break;
			}
		}
		
		System.out.println("First occurrance of biggest No");
		int charLength = 1;
		int maxLength = 1;
		char maxChar=' ';
		Set<Character> keySet = map.keySet();
		for(char ch:keySet){
			if(map.get(ch)>=maxLength){
				maxLength=map.get(ch);
				maxChar = ch;
				
			}
		}
		System.out.println("Max Char Length:"+maxChar+" length"+maxLength);
		/*List<Integer> valueList = (ArrayList<Integer>)map.values();
		Collections.reverse(valueList);
		System.out.println(valueList.get(0));*/
		
		
		scn.close();
	}

}
