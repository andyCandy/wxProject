package com.metarnet.sfpw.base.exception;

public class ConnectionException extends Exception{

private static final long serialVersionUID = -8740773473953057747L;
	
	private String reason;
	
	private String localMessage;
	
	public ConnectionException (){}
	
	public ConnectionException (String message,String reason){
		super(message);
		this.reason = reason;
	}
	public ConnectionException (String message,String localMessage,String reason){
		super(message);
		this.reason = reason;
		this.localMessage = localMessage;
	}
	
	public ConnectionException (String message,String reason,Throwable e){
		super(message,e);
		this.reason = reason;
	}
	
	public ConnectionException (String message,String reason,String localMessage,Throwable e){
		super(message,e);
		this.reason = reason;
		this.localMessage = localMessage;
	}
	
	public ConnectionException (Throwable e){
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
