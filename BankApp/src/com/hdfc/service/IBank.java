package com.hdfc.service;
/*
 * @ Author Vikas Team Leader 
 * 
 */
public interface IBank {
	public static final String IFSC="HDFC123"; //all varibles are public static final
	
	
	public abstract void deposit();
	public abstract void withdraw();  // all methods are public abstarct 
	
	

}
