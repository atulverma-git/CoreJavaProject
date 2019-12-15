package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException {
		
		// load Class class Object for Given Class Name
		Class cl = Class.forName("jvm.Student");
		
		// fetch All Methods in Student class
		
		Method[] methods = cl.getDeclaredMethods();
		
		for(Method mt:methods){
			System.out.println("Method: "+mt);
		}
		
		System.out.println("======================================================");
		
		// Fetching Instance Variables in Student class.
		
		Field[] fields  = cl.getDeclaredFields();
		
		for(Field field:fields){
			System.out.println("field: "+field);
		}
		
		System.out.println("======================================================");
		
		/*	only One Class class object is created for every .class file
		**	even though multiple object of loaded class is created
		*/
		Student st1 = new Student();
		Class cl1 = st1.getClass();
		
		Student st2 = new Student();
		Class cl2 = st2.getClass();
		
		if(cl1==cl2){
			System.out.println("Is only one class object created? "+(cl1==cl2));
			System.out.println("hashcode of cl1: "+cl1.hashCode());
			System.out.println("hashcode of cl1: "+cl2.hashCode());
		}
		
	}

}
