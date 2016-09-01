package labs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleAppTest {

	@Test
	public void integerTest() {
		Circle circle = new Circle(2);
		System.out.println("Testing with radius = 2.");
		assertEquals("12.57", circle.getFormattedCircumference());
		System.out.println("Expected 12.57, received " + circle.getFormattedCircumference());
		assertEquals("12.57", circle.getFormattedArea());
		System.out.println("Expected 12.57, received " + circle.getFormattedArea());
		
	}
	
	@Test
	public void doubleTest() {
		Circle circle = new Circle(3.7);
		System.out.println("Testing with radius = 3.7.");
		assertEquals("23.25", circle.getFormattedCircumference());
		System.out.println("Expected 23.25, received " + circle.getFormattedCircumference());
		assertEquals("43.01", circle.getFormattedArea());
		System.out.println("Expected 43.01, received " + circle.getFormattedArea());
		
	}

}
