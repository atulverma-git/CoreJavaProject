package serialiazationTest;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	//private int salary;
	private String sruname;
	private Adress address;
	
	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}*/
	
	public String getSruname() {
		return sruname;
	}
	public void setSruname(String sruname) {
		this.sruname = sruname;
	}
	@Override
	public String toString(){
		return "id: "+getId()+" name: "+getName()+" age: "+getAge()+" address: "+getAddress()+" surname: "+getSruname();
	}

}
