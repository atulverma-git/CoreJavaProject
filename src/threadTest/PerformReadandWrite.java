package threadTest;

import java.util.ArrayList;
import java.util.List;

public class PerformReadandWrite {
	private static List<Integer> arrayList= new ArrayList<Integer>();

	public void write(Integer i){
		System.out.println("write operation starts........");
			arrayList.add(i);
	}
	
	public List<Integer> read(){
		System.out.println("read operation starts");
		if(!arrayList.isEmpty()){
			return arrayList;
		}
		return null;
	}
		
}
