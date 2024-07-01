package com.example.Employee.exception;

public class ErrorDetails {
	
	private int statuscode;
	private String message;
	private String details;
	
    public ErrorDetails(int statuscode ,String message , String details ) {
    	super();
    	this.statuscode = statuscode;
    	this.message = message;
    	this.details = details;
    	
    }
    
    public int getStastusCode() {
		return statuscode;
    }
    
    public void setStatuscode(int statuscode) {
    	this.statuscode = statuscode;
    }
    
    
    
    public String getmessage() {
    	return message;
    }
    
    public void setmessage(String message) {
    	this.message = message;
    }
    
    	
	
    public String  getdetails() {
    	return details;
    }
    
    public void setdetails(String details) {
	   this.details = details;
    }
	
	

}
