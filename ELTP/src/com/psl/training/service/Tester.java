package com.psl.training.service;

public class Tester {
	public static void main(String[] args) {
		
		int x=20,  y=0;
		
		CalculatorService service=new CalculatorService();
		int result=0;
		
		try {
			result=service.performCalculations(Operations.ADD, x, y);
		
			System.out.println(" Addition :"+result);
			result=service.performCalculations(Operations.SUB, x, y);
			System.out.println(" Substration :"+result);
			result=service.performCalculations(Operations.MULTIPLY, x, y);
			System.out.println(" Multiplicatgion :"+result);
			result=service.performCalculations(Operations.DIVIDE, x, y);
			System.out.println(" Division :"+result);
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("-------- End Of Main-----------");
		
	}
}
