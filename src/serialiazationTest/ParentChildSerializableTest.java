package serialiazationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ParentChildSerializableTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		dog d = new dog();
		try{
			FileOutputStream fos = new FileOutputStream("ParentChildSerializableTest.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			fos.close();
		}catch(IOException io){
			io.printStackTrace();
		}
		
		try{
			FileInputStream fis = new FileInputStream("ParentChildSerializableTest.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			dog d1 = (dog)ois.readObject();
			System.out.println("i"+d1.i+"......j"+d1.j );
			System.out.println("val: "+d1.val);		// calling transient variable will show 'null'
			System.out.println("staticVal: "+d1.staticVal);
			System.out.println("final transient val: "+d1.finalVal);
			fis.close();
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

class Animal {
	int i= 10;
	public static transient String staticVal="Static value is changed..., and value will be same after desrialization."
			+ "\ntransient doesnt have to do with it..";
	public final transient String finalVal="this is a final variable..., and value will be same after desrialization."
			+ "\ntransient doesnt have to do with it..";
}

class dog extends Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int j=20;
	transient String val = "it is a transitent variable and will not participate in serialization";
}