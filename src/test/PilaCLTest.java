package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.PilaCL;

public class PilaCLTest {

	private PilaCL pilaCL;

	@Before
	public void setUp() {
		pilaCL = new PilaCL();
	}
	
	@Test
	public void testPush() {
		pilaCL.push(1);
		Assert.assertEquals(Integer.valueOf(1), pilaCL.peek());	
	}
	
	@Test
	public void testPop() {
		pilaCL.push(1);
		pilaCL.push(2);
		Integer prueba = (Integer) pilaCL.pop();
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {
		pilaCL.push(1);
		pilaCL.push(2);
		pilaCL.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), pilaCL.peek());
	}
	
	@Test
	public void testIsEmpty () {
		Assert.assertEquals(true, pilaCL.isEmpty());
	}
	
	@Test
	public void testEmpty () {
		pilaCL.push(1);
		pilaCL.push(2);
		pilaCL.empty();
		
		Assert.assertEquals(true, pilaCL.isEmpty());
	}

}
