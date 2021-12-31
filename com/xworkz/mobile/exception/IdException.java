package com.xworkz.mobile.exception;

public class IdException extends RuntimeException{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Id connot be 0";
	}
}
