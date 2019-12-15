package com.myExceptions;

public class QueueFullException extends RuntimeException {
	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;

	public QueueFullException(){
		super();
	}
	
	public QueueFullException(String message){
		super(message);
	}
}
