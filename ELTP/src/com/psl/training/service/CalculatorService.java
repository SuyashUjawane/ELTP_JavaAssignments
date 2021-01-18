package com.psl.training.service;
import com.psl.training.util.*;

public class CalculatorService {
	public int performCalculations(Operations op, int n1, int n2) throws Exception {
		Calculator calc = new Calculator();
		int result = 0;
		switch (op) {
		case ADD:
			result = calc.add(n1, n2);
			break;
		case MULTIPLY:
			result = calc.multiply(n1, n2);
			break;
		case DIVIDE:
			result = calc.divide(n1, n2);
			break;
		case SUB:
			result = calc.sub(n1, n2);
			break;
		default:
			break;
		}
		return result;
	}
	
}
