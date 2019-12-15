package org.junit.test.DemoJunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCalculator {
	Calculator spy;
	CalculatorService service;
	
	@Before
	public void init(){
		spy = spy(new Calculator());
		service = mock(CalculatorService.class);
		when(spy.getCalculatorService()).thenReturn(service);
		//doReturn(service).when(spy.getCalculatorService());
	}

	@Test
	public void test() {
		when(service.add(2,3)).thenReturn(6);
		assertEquals(10, spy.perform(2, 3));
	}

}
