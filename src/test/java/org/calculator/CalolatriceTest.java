package org.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalolatriceTest {
	
private static Calcolatrice c;
	
	@BeforeAll
	private static void beforeAll() {
		c = new Calcolatrice();
	}
	
	@Test
	@DisplayName("Test somma")
	void testAdd() {
		float sum = c.add(20, 30);	
		assertEquals(50, sum, "Somma non conforme");
	}
	
	@Test
	@DisplayName("Test sottrazione")
	void testSubtract() {
		float subtract= c.subtract(10.5f, 5.0f);	
		assertEquals(5.5f, subtract, "Sottrazione non conforme");
	}
	
	@Test
	@DisplayName("Test divisione")
	void testDivide() throws Exception {
		float divide= c.divide(100.10f, 10);	
		assertEquals(10.010000228881836, divide, "Divisione non conforme");
	}
	
	@Test
	@DisplayName("Test Moltiplicazione")
	void testMultiply() {
		float multiply = c.multiply(100.55f, 5.5f);	
		assertEquals(553.025f, multiply, "Moltiplicazione non conforme");

  }
}
