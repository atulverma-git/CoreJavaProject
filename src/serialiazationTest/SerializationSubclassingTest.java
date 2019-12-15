package serialiazationTest;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSubclassingTest {

	public static void main(String[] args){
		Sub obj = new Sub();
		FileOutputStream file;
		ObjectOutputStream oos;
		try {
			file = new FileOutputStream("super.txt");
			 oos = new ObjectOutputStream(file);
			oos.writeObject(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Super implements Serializable{

	private static final long serialVersionUID = 1L;
		
}

class Sub extends Super{

	private static final long serialVersionUID = 1L;
	
	public String desc = "Non Serialized Class";
	
	// throw exception from the body of writeObject method to support no serialization. 
	private void writeObject(ObjectOutputStream os) throws NotSerializedException {
	     throw new NotSerializedException("This class cannot be Serialized");
	} 
	
	
}