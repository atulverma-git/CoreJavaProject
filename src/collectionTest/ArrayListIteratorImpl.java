package collectionTest;

import java.util.*;
public class ArrayListIteratorImpl {
	
	
	public static void main(String[] args) {
		
		//LinkedList<String> ll = new LinkedList<>();
		
		List<String> linkList = new LinkedList<String>();
		
		String str = "Hello i am a String Array";
		List<String> stringList = Arrays.asList(str.split("\\s"));
//		stringList.
		System.out.println("string list: "+stringList);
		
		linkList.add("Hello");
		linkList.add("I");
		linkList.add("am");
		linkList.add("Linked");
		linkList.add("List");
		linkList.add("Collection");
		linkList.add("am");
		
		// ListIterator can iterate forward as well as backward.
		ListIterator<String> li = linkList.listIterator();
		
		// forward iteration
		while(li.hasNext()){
			System.out.print(li.next()+" ");
		}
		
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		
		
		System.out.println();
		Set<String> set = new HashSet<>();
		set.addAll(linkList);
		
		System.out.println("hashSet: "+set);
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(linkList);
		System.out.println("linkedHashSet: "+linkedHashSet);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.addAll(linkList);
		System.out.println("treeSet: "+treeSet);
		
		Map<String, String> map = new HashMap<>();
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");
		map.put("Key3", "Value3");
		map.put("Key4", "Value4");
		map.put("Key5", "Value5");
		map.put("Key1", "Value6");
		
		
		Set<String> mapKeySet = map.keySet();
		
		for(String key:mapKeySet){
			System.out.println(map.get(key));
		}
		
		System.out.println("Using Map.Entry");
		
		Set<Map.Entry<String, String>> mapEntry = map.entrySet();
		
		for(Map.Entry<String, String> entry:mapEntry){
			System.out.println("entry: "+entry);
		}
		
		/*System.out.println("Property Class Exmaple....");
		Properties p = System.getProperties();
		
		Set<Object> keySet = p.keySet();
		for(Object obj: keySet){
			System.out.println((String)obj+" = "+p.getProperty((String)obj));
		}*/
		
		Collections.sort(linkList, Collections.reverseOrder());
		
		System.out.println("sorted linklist"+linkList);
	}

}
