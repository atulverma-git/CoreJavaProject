package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeSorting {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		LinkedList empLinkedList = new LinkedList(); 
		
		empList.add(new Employee("John",50,5000));
		empList.add(new Employee("Mac",45,4500));
		empList.add(new Employee("Fill",27,25000));
		empList.add(new Employee("Gear",60,65000));
		empList.add(new Employee("Dow",42,45000));
		empList.add(new Employee("Beil",50,55000));
		
		Employee emp1 = new Employee("John",50,5000);
		Employee emp2 = new Employee("John",50,5000);
		Employee emp3 = emp1;
		
		if(emp1.equals(emp2))
			System.out.println("emp1 euqals emp2");
		else
			System.out.println("emp1 not euqals emp2");
		
		
		if(emp1.equals(emp3))
			System.out.println("emp1 euqals emp3");
		else
			System.out.println("emp1 not euqals emp3");
		System.out.println("Before Sorting list is: "+empList);
		
		/*Collections.sort(empList);
		
		System.out.println("After Sorting list: "+empList);*/
		
		SortedSet<Employee> treeSet = new TreeSet<>();
		
		/*treeSet.addAll(empList);  // Employee must implement comparable to add in element in TreeSet
		
		System.out.println("treeset: "+treeSet);*/
		
		System.out.println("****************MAP TEST WITHOUT hashCode() and equals() implementation*********");
		
		Map<Employee,String> empMap = new HashMap<>();
		Employee e1 = new Employee("John",50,5000);
		Employee e2 = new Employee("Atul",50,5000);
		Employee e3 = new Employee("John",50,5000);
		
		
		empMap.put(e1,e1.getName());
		empMap.put(e2,e2.getName());
		empMap.put(e3,e3.getName());
		
		System.out.println("e1 hash code:"+e1.hashCode());
		System.out.println(empMap.get(e1));
		e1.setAge(25);
		System.out.println("e1 hash code after modification:"+e1.hashCode());
		System.out.println(empMap.get(e1));
		System.out.println(empMap.get(e3));
		System.out.println(empMap.size());
		
	}

}
