package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimplecalculatorTest {

	@Test
	public void test() {
		Simplecalculator cal=new Simplecalculator();
		cal.add(10,20);
		assertEquals(30,cal.getResult());
	}

}
