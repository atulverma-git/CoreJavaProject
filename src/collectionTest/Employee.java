package collectionTest;

public class Employee {
	private String name;
	private int age;
	private int salary;
	
	public Employee(String name, int age, int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}*/

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}*/
	

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


/*	public int compareTo(Employee o) {
		
//		return this.name.compareTo(o.name);
		
		return this.age-o.age;
	}*/
	
	
}
