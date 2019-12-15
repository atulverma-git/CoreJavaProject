package org.junit.test.DemoJunit;

public class Calculator {
	;
	
	public CalculatorService getCalculatorService(){
		return new CalculatorService();
	}
	
	public int perform(int i, int j){
		//CalculatorService service = new CalculatorService();
		return getCalculatorService().add(i, j)*i;
	}

}
