package com.psl.training.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Calculator {
 
	static Logger logger = Logger.getLogger(Calculator.class.getName());
	
	static{
		 try {
	
			logger.addHandler(new FileHandler("calc.log", true));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public int add(int x, int y){
		return x+y;
	}
	public int multiply(int x, int y){
		return x*y;
	}
	public int divide(int x, int y) throws Exception {
		int result=0;
		try{
			result=x/y;
		}catch(RuntimeException ex){
			// log the exceptions 
			logger.info(" Exception occured"+ ex);
			//logger.severe(" Alert! Divide by Zero ");
			// Perform logging and inform to the callers about the exception
			// Changing the Exception Type 
			Exception exception=new Exception("Invalid Input");
			exception.initCause(ex);
			throw exception;
		}
		return result;
	}
	public int sub(int x, int y){
		return x-y;
	}
	
}
