package serialiazationTest;

import java.io.IOException;

public class NotSerializedException extends IOException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description="NotSerializedException:";
	
	public NotSerializedException(){
		
	}
	
public NotSerializedException(String str){
		description = description+str;
	}

}
