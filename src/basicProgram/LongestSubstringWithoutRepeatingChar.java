package basicProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		longestSubString("javaconceptoftheday");
		System.out.println("---------------------");
	}
	
	static void longestSubString(String input){ 
		int longestStringSize = 0; 
		String longestString = "";
		char[] charArray = input.toCharArray(); 
		Map<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<charArray.length;i++){
//			System.out.println("curr curson pos: "+i);
			char ch=charArray[i];
			if(!charPosMap.containsKey(ch)){
				charPosMap.put(ch, i);
			}else{
				i=charPosMap.get(ch);
//				System.out.println("new curson pos: "+i);
				charPosMap.clear();
			}
			
			if(charPosMap.size()>longestStringSize){
				longestStringSize=charPosMap.size();
				longestString=charPosMap.keySet().toString();
			}
		}
		
		 System.out.println("Input String : "+input);
         
	     System.out.println("The longest substring : "+longestString);
	         
	     System.out.println("The longest Substring Length : "+longestStringSize);
	}

}
