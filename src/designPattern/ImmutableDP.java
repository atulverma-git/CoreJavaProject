package designPattern;

public final class ImmutableDP {
	private final int id;
	private final String name;
	private final int age;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ImmutableDP(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ImmutableDP [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
