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

	@Test
	public void testMul() {
		Simplecalculator cal=new Simplecalculator();
		cal.multi(10,20);
		assertEquals(200,cal.getResult());
	}
	@Test
	public void testInc() {
		Simplecalculator cal=new Simplecalculator();
		cal.inc(100);
		assertEquals(100,cal.getResult());
		cal.inc(200);
		assertEquals(300,cal.getResult());
	}
	
}
