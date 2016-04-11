package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimplecalculatorTest {

	@Test
	public void testAdd() {
		Simplecalculator cal=new Simplecalculator();
		cal.add(10,20);
		assertEquals(30,cal.getResult());
	}
	
	@Test
	public void testSub() {
		Simplecalculator cal=new Simplecalculator();
		cal.sub(10,20);
		assertEquals(-10,cal.getResult());
	}
	

	@Test
	public void testDiv() {
		Simplecalculator cal=new Simplecalculator();
		cal.div(100,20);
		assertEquals(5,cal.getResult());
	}
	
}
