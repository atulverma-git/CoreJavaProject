package jvm;

public class ClassLoadersImpl {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(String.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		
		// try to load already loaded class by Parent ClassLoader. 
		Class.forName("jvm.Student", true, Student.class.getClassLoader().getParent());
	}

}
