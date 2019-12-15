package serialiazationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerilizationImpl {
	
	public static boolean writeObj(Employee empl){
		try{
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(empl);
		
		oos.close();
		fos.close();
		System.out.println("writing Object is done");
		
		return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		/*Employee emp = new Employee();
		Adress address = new Adress("Adress1", "address2","Delhi",110092);
		emp.setId(234);
		emp.setName("ABC");
		emp.setAge(39);
		emp.setSalary(100000);
		emp.setAddress(address);*/
		
		//writeObj(emp);
		
		FileInputStream fis;
		ObjectInputStream ois;
		try{
			fis = new FileInputStream("employee.txt");
			ois = new ObjectInputStream(fis);	
			System.out.println("emp after deserilization: "+ois.readObject());
			ois.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//System.out.println("normal toString: "+emp);
	}

}
