package com.metarnet.sfpw.base.exception;

public class TaskException extends Exception{
	
	private static final long serialVersionUID = -8740773473953057747L;
	
	private String reason;
	
	private String localMessage;
	
	public TaskException (){}
	
	public TaskException (String message,String reason){
		super(message);
		this.reason = reason;
	}
	public TaskException (String message,String localMessage,String reason){
		super(message);
		this.reason = reason;
		this.localMessage = localMessage;
	}
	
	public TaskException (String message,String reason,Throwable e){
		super(message,e);
		this.reason = reason;
	}
	
	public TaskException (String message,String reason,String localMessage,Throwable e){
		super(message,e);
		this.reason = reason;
		this.localMessage = localMessage;
	}
	
	public TaskException (Throwable e){
		super(e);
	}

	public String getReason() {
		return reason;
	}

	@Override
	public String getLocalizedMessage() {
		return localMessage;
	}
	
	
	
}
