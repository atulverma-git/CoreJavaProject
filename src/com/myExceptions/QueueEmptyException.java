package com.myExceptions;

public class QueueEmptyException extends RuntimeException {

	private static final long serialVersionUID = 5325116397103158435L;
	
	public QueueEmptyException(){
		super();
	}
	
	public QueueEmptyException(String message){
		super(message);
	}

}
