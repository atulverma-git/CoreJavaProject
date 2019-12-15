package collectionTest.customCollection;

import collectionTest.Employee;

public class ArrayListCustomImpl {

	public static void main(String[] args) {
				
		
		ArrayListCustom<Employee> empList = new ArrayListCustom<>();
		
		Employee e1 = new Employee("Atul",34,150000);
		empList.add(new Employee("Joy",56,50000));
		empList.add(new Employee("Bill",40,45000));
		empList.add(new Employee("Sim",36,95000));
		empList.add(e1);
		/*empList.add(new Employee("Willow",39,78000));
		empList.add(new Employee("Jane",41,34000));
		empList.add(new Employee("Howal",23,21000));
		
		empList.add(e1);*/
		
		System.out.println("displaying employee lsit...");
		empList.display();
		
		//System.out.println("empList.get(5): "+empList.get(5));
		System.out.println(empList.remove(3));
		System.out.println("after deletion new list: ");
		empList.display();
		
		System.out.println("index of e1:"+empList.indexOf(e1));
	}

}
