package com.game.exception;

public class ArcheryGameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ArcheryGameException(String msg){
		super(msg);
	}
	
	public ArcheryGameException(Exception ex){
		super(ex);
	}
	
	public ArcheryGameException( String msg, Exception ex){
		super( msg, ex);
	}
}
