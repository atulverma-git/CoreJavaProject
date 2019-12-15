package serialiazationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerializableTest {

	public static void main(String[] args) {
		try{
			Account acc = new Account();
			FileOutputStream fio = new FileOutputStream("CustomizedSerializableTest.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fio);
			oos.writeObject(acc);
			fio.close();
			oos.close();
		}catch(IOException io){io.printStackTrace();}
		try{
			FileInputStream fis = new FileInputStream("CustomizedSerializableTest.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account acc = (Account)ois.readObject();
	     	System.out.println("Usename: "+acc.getUserName()+"... password: "+acc.getPsw());
	     	fis.close();
	     	ois.close();
		}catch(Exception io){io.printStackTrace();}
		
	}

}

class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName="averma";
	transient private String psw = "passowrd";
	
	
	public String getUserName() {
		return userName;
	}

	public String getPsw() {
		return psw;
	}

	// this method is executed by JVM at the time of serialization to implement Customized Serializable.
	private void writeObject(ObjectOutputStream oos) throws IOException{
		System.out.println("Customized writeObject is called: ");
		oos.defaultWriteObject();
		String ePassword = "#123"+psw;
		oos.writeObject(ePassword);
		
	}
	
	// this method is executed by JVM at the time of deserialization to implement Customized Serializable.
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ois.defaultReadObject();
		String ePassword = (String)ois.readObject();
		psw = ePassword.substring(4);
	}
}
